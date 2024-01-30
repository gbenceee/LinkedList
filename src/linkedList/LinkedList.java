package linkedList;

public class LinkedList {

	private Link first = new Link(true);

	public boolean add(int number) {
		boolean contains = contains(number);
		Link newLink = new Link(number);
		Link second = first.getNext();
		first.setNext(newLink);
		newLink.setNext(second);
		return !contains;
	}

	public void delete(int number) {
		Link current = first.getNext();
		Link previous = first;
		while (current != null) {
			if (current.getValue() == number) {
				previous.setNext(current.getNext());
			} else {
				previous = current;
			}
			current = current.getNext();
		}
	}

	public boolean contains(int number) {
		Link current = first.getNext();
		while (current != null) {
			if (current.getValue() == number) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public String getElementsAsString() {
		Link current = first.getNext();
		StringBuilder builder = new StringBuilder();
		while (current != null) {
			if (current != first.getNext()) {
				builder.append(" - ");
			}
			builder.append(current.getValue());
			current = current.getNext();
		}
		return builder.toString();
	}
}