package com.sirma.itt.javacourse.readcons;

/**
 * Exception which is thrown when the number is not between 100 and 0.
 * 
 * @author Nikolay Ch
 * 
 */
public class NotInIntervalException extends Exception {

	/**
	 * Empty constructor.
	 */
	public NotInIntervalException() {
		
	}
	/**
	 * The constructor fot the Exception.
	 * 
	 * @param error
	 */
	public NotInIntervalException(String  error) {
		super(error);
	}

	/**
	 * Says what the problem is.
	 */
	public String printError() {
		return "Your number must be between 0 and 100.But do not worry we will correct it.";
	}

	/**
	 * Corrects the problem.
	 * 
	 * @param num
	 *            the wrong number
	 * @return corrected number
	 */
	public int correctMis(int num) {
		if (num > 100) {
			return num % 100;
		} else if (num > -100 && num < 0) {
			return num * -1;
		} else {
			return (num * -1) % 100;
		}
	}
}
