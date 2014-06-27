package com.sirma.itt.javacourse.sumator;

/**
 * Main class which sums two strings by the methods in Sum.
 * 
 * @author Nikolay Ch
 * 
 */
public class Main {
	private static String first;
	private static String second;

	/**
	 * Initializes the values of the strings and sums them.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println("Enter the first.");
		first = Sum.input();
		System.out.println("Enter the second.");
		second = Sum.input();

		System.out.println("The sum is: " + Sum.Sumator(first, second));
		
	}
}
