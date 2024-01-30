package orderedLinkedList;

public class Link {

	private int value;
	private Link next;

	public Link(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

}
