package orderedDoublyLinkedList;

import list.IntList;

public class Main {

	public static void main(String[] args) {
		IntList list = new OrderedDoublyLinkedList();
		list.add(12);
		list.add(21);
		list.add(3);
		list.add(42);
		list.add(42);
		list.add(8);
		list.add(42);
		list.add(1);
		System.out.println(list.getElementsAsString());
		System.out.println("--------");
		list.delete(42);
		System.out.println(list.getElementsAsString());

	}

}
