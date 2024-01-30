package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.add(42);
		System.out.println(numbers.getElementsAsString());
		numbers.add(17);
		System.out.println(numbers.getElementsAsString());
		numbers.add(32);
		System.out.println(numbers.getElementsAsString());
		numbers.add(42);
		System.out.println(numbers.getElementsAsString());
		numbers.add(42);
		System.out.println(numbers.getElementsAsString());
		numbers.add(8);
		System.out.println(numbers.getElementsAsString());
		numbers.add(73);
		System.out.println(numbers.getElementsAsString());
		System.out.println("--------");
		numbers.delete(42);
		System.out.println(numbers.getElementsAsString());
		System.out.println("--------");
		System.out.println(numbers.add(42));// false
		System.out.println(numbers.add(1));// true
		System.out.println(numbers.add(17));// false
		System.out.println(numbers.add(0));// true
		System.out.println(numbers.add(8));// false
		System.out.println(numbers.add(5));// true
	}

}
