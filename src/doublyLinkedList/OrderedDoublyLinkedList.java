package doublyLinkedList;

import list.InitList;

public class OrderedDoublyLinkedList implements InitList {

	private Link first = new Link(true);
	private Link last = new Link(true);

	public OrderedDoublyLinkedList() {
		this.first.setNext(last);
		this.last.setPrevious(first);
	}

	@Override
	public boolean add(int number) {
		Link newLink = new Link(number);
		Link next = first.getNext();
		Link previous = first;
		while (!next.isBound()) {
			if (next.getValue() > number) {
				break;
			}
			previous = next;
			next = next.getNext();
		}
		newLink.setPrevious(previous);
		newLink.setNext(next);
		previous.setNext(newLink);
		next.setPrevious(newLink);
		return !contains(number);
	}

	@Override
	public void delete(int number) {
		Link current = first.getNext();
		while (!current.isBound()) {
			if (current.getValue() == number) {
				Link previous = current.getPrevious();
				Link next = current.getNext();
				previous.setNext(current.getNext());
				next.setPrevious(previous);
			}
			current = current.getNext();
		}
	}

	@Override
	public boolean contains(int number) {
		Link current = first.getNext();
		while (!current.isBound()) {
			if (current.getValue() == number) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	@Override
	public String getElementsAsString() {
		StringBuilder builder = new StringBuilder();
		Link current = first.getNext();
		while (!current.isBound()) {
			if (current != first.getNext()) {
				builder.append(" - ");
			}
			builder.append(current.getValue());
			current = current.getNext();
		}
		return builder.toString();
	}

}
