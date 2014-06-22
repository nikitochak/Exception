package com.sirma.itt.javacourse.readcons;

import java.util.Scanner;

/**
 * Class which reads from the console only numbers between 100 and 0.
 * 
 * @author Admin
 * 
 */
public class Read {
	private static int num;
	private static Scanner sr;

	/**
	 * Reads a number from the console and if it is not between 0 and 100 throws
	 * and appropriate exception.
	 * 
	 * @return the corrected number
	 */
	public static int insert() {
		sr = new Scanner(System.in);
		num = sr.nextInt();
		try {
			if (num > 100 || num < 0)
				throw new NotInIntervalException();
			else {
				System.out.println("It is correct");
				return num;
			}
		} catch (NotInIntervalException e) {
			num = e.correctMis(num);
			e.printError();
			return num;
		}
	}

	/**
	 * Checks if the number is between 0and 100.
	 * 
	 * @param num
	 *            the number the customer want to check.
	 * @return the corrected value if it is need
	 */
	public static int insert(int num) {

		try {
			if (num > 100 || num < 0)
				throw new NotInIntervalException();
			else {
				System.out.println("It is correct");
				return num;
			}
		} catch (NotInIntervalException e) {
			num = e.correctMis(num);
			e.printError();
			return num;
		}
	}
}
