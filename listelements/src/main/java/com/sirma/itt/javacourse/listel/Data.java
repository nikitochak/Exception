package com.sirma.itt.javacourse.listel;

/**
 * Class with fields and their getters and setters.
 * 
 * @author Nikolay Ch
 * 
 */
public class Data {
	private int number;
	private String name;

	/**
	 * Setter for the field name.
	 * 
	 * @param name
	 *            the value for the field
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for the number field.
	 * 
	 * @param number
	 *            the value for the field number
	 */
	public void setNum(int number) {
		this.number = number;
	}

	/**
	 * Getter for the number field.
	 * 
	 * @return the value of the field
	 */
	public int getNum() {
		return this.number;
	}

	/**
	 * Getter for the name value.
	 * 
	 * @return the value in name field
	 */
	public String getName() {
		return this.name;
	}

}
