package org.lessons.java.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {

		for (int i = 1; i < 101; i++)

			if (i % 15 == 0)
				System.out.println(" FIZZBUZZ!!!");
			else if (i % 5 == 0)
				System.out.print(" Buzz!");
			else if (i % 3 == 0)
				System.out.print(" Fizz");
			else
				System.out.print(" " + i);

	}

}
