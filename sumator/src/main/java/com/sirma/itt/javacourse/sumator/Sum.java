package com.sirma.itt.javacourse.sumator;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Sums two strings and throw some Exceptions.
 * 
 * @author Nikolay Ch
 * 
 */
public class Sum {

	private static Scanner sk; // reads from the console
	private static String line; // the string read from the console
	private static int numberIs;

	/**
	 * String method which returns a string with only numbers. If the customer
	 * inserts a character it catches the exception and allows to insert the
	 * string again.
	 * 
	 * @return the value of a string with only numbers
	 */
	public static String input() {
		boolean isCorrect = false;// keeps if the input data is correct
		System.out.println("Please enter the number");

		sk = new Scanner(System.in);
		
			
			try {
				line = sk.next();
				numberIs = Integer.parseInt(line);

			} catch (NumberFormatException e) {
				
				isCorrect = false;
				throw new NumberFormatException("Please only numbers");
			}
		
		return line;

	}

	/**
	 * Returns the sum of two strings.
	 * 
	 * @param a
	 *            the first string
	 * @param b
	 *            the second string
	 * @return the sum of the strings
	 */
	public static String Sumator(String a, String b) {
		BigInteger sum = new BigInteger(a);
		BigInteger second = new BigInteger(b);
		sum = sum.add(second);

		return sum.toString();

	}

}
