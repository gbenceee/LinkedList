package orderedLinkedList;

public class OrderedLinkedList {

	private Link first;

	public boolean add(int number) {
		boolean contains = contains(number);
		Link insertionPoint = first;
		Link previous = first;
		while (insertionPoint != null && insertionPoint.getValue() < number) {
			previous = insertionPoint;
			insertionPoint = insertionPoint.getNext();
		}
		Link newLink = new Link(number);
		if (insertionPoint == first) {
			newLink.setNext(first);
			first = newLink;
		} else {
			previous.setNext(newLink);
			newLink.setNext(insertionPoint);
		}
		return !contains;
	}

	public void delete(int number) {
		Link current = first;
		Link previous = current;
		while (current != null) {
			if (current.getValue() == number) {
				if (current == first) {
					first = current.getNext();
				} else {
					previous.setNext(current.getNext());
				}
			} else {
				previous = current;
			}
			current = current.getNext();
		}
	}

	public boolean contains(int number) {
		Link current = first;
		while (current != null) {
			if (current.getValue() == number) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public String getElementsAsString() {
		Link current = first;
		StringBuilder builder = new StringBuilder();
		while (current != null) {
			if (current != first) {
				builder.append(" - ");
			}
			builder.append(current.getValue());
			current = current.getNext();
		}
		return builder.toString();
	}
}