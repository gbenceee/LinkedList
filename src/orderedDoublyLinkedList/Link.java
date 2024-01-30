package orderedDoublyLinkedList;

public class Link {
	private Link next;
	private Link previous;
	private int value;
	private boolean isBound;

	public Link(boolean bound) {
		this.isBound = bound;
	}

	public Link(int value) {
		this.value = value;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public boolean isBound() {
		return isBound;
	}

	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

}