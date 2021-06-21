package fp;

import java.util.List;

// reduce operation
public class C2 {

	public static void main(String[] args) {
		// add all numbers in a list
		System.out.println("add all numbers");
		dotraditional(List.of(13, 6, 7, 8, 5, 13, 9, 4));
		System.out.println("dofpstyle");
		dofpstyle(List.of(13, 6, 7, 8, 5, 13, 9, 4));
		// print all even numbers in the list
		System.out.println("findhighest");
		findhighest(List.of(0, 13, -1, 6, 7, 8, 5, 13, 9, 4, 26));
		// print squares of all even numbers in the list
		System.out.println("sumofallsquaresfpstyle");
		sumofallsquaresfpstyle(List.of(4, 5, 6));
		// print sum of all odd numbers in the list
		System.out.println("sumofoddnumbers");
		sumofoddnumbers(List.of(13, 6, 7, 8, 5, 13, 9, 4));
	}

	private static void dotraditional(List<Integer> numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		System.out.println("sum = " + sum);
	}

	private static void dofpstyle(List<Integer> numbers) {
		// using jdk method
		System.out.println("dofpstyle way 1");
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum = " + sum);
		// using custom method
		System.out.println("dofpstyle way 2");
		sum = numbers.stream().reduce(0, C2::sum);
		System.out.println("sum = " + sum);
		// using lambda expression
		System.out.println("dofpstyle way 3");
		sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("sum = " + sum);
	}

	private static int sum(int aggregate, int nextnumber) {
		return aggregate + nextnumber;
	}

	private static void findhighest(List<Integer> numbers) {
		int highest = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
		System.out.println("highest = " + highest);
	}

	private static void sumofallsquaresfpstyle(List<Integer> numbers) {
		int sum = numbers.stream().map(n -> n * n).reduce(Integer::sum).get();
		System.out.println("sumofallsquaresfpstyle = " + sum);
	}

	private static void sumofoddnumbers(List<Integer> numbers) {
		int sum = numbers.stream().filter(n -> n % 2 != 0).reduce(Integer::sum).get();
		System.out.println("sumofoddnumbers = " + sum);
	}

}
