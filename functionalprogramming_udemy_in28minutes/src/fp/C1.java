package fp;

import java.util.List;

public class C1 {

	public static void main(String[] args) {
		// print all numbers in a list
		System.out.println("dotraditional");
		dotraditional(List.of(13, 6, 7, 8, 5, 13, 9, 4));
		System.out.println("dofpstyle");
		dofpstyle(List.of(13, 6, 7, 8, 5, 13, 9, 4));
		// print all even numbers in the list
		System.out.println("findallevenfpstyle");
		findallevenfpstyle(List.of(13, 6, 7, 8, 5, 13, 9, 4));
		// print squares of all even numbers in the list
		System.out.println("printsquaresfpstyle");
		printsquaresofevennumbersfpstyle(List.of(13, 6, 7, 8, 5, 13, 9, 4));
	}

	private static void dotraditional(List<Integer> numbers) {
		for (int n : numbers) {
			System.out.println(n);
		}
	}

	private static void dofpstyle(List<Integer> numbers) {
		System.out.println("dofpstyle way 1");
		numbers.forEach(n -> System.out.println(n));
		System.out.println("dofpstyle way 2");
		numbers.forEach(System.out::println);

	}

	private static void findallevenfpstyle(List<Integer> numbers) {
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	private static void printsquaresofevennumbersfpstyle(List<Integer> numbers) {
		numbers.stream().filter(n -> n % 2 == 0)
				// map - Returns a stream consisting of the results of applying the given
				// function to the elements of this stream.
				.map(n -> n * n)
				// print each element
				.forEach(System.out::println);
		// print all even numbers and their squares on the same line separated by ->
		numbers.stream().filter(n -> n % 2 == 0).forEach(number -> {
			System.out.println(number + " -> " + number * number);
		});
	}

}
