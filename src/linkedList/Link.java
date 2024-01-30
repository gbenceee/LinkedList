package linkedList;

public class Link {

	private int value;
	private Link next;
	private boolean isBound;

	public Link(boolean isBound) {
		this.isBound = isBound;
	}

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

	public boolean isBound() {
		return isBound;
	}

}