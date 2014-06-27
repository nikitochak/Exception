package com.sirma.itt.javacourse.listel;

/**
 * 
 * Makes an List of objects and some methods for adding new element,removing and
 * printing all the elements.
 * 
 * @author Nikolay Ch
 * 
 */
public class List {
	private int size;
	public Data[] list = new Data[10];
	private int towhere = 0;

	/**
	 * Constructor for the class which makes the first element of the list null.
	 */
	public List() {
		size = 0;
	}

	public List(int size) {
		this.size = size;
		towhere = 0;
	}

	/**
	 * Inserts new data in the end of the list.If it is full, throw new
	 * exception.
	 * 
	 * @param data
	 *            the data we want to insert
	 * @throws ArrayIndexOutOfBoundsException
	 *             if you try to insert new element in full list
	 */
	public void add(Data data) {
		try {
			if (towhere == size) {
				throw new ArrayIndexOutOfBoundsException();
			}
			list[towhere] = data;
			towhere++;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException(
					"Sorry the array is full.You can not insert any more data.");
		}
	}

	/**
	 * Removes the last of the list if it is not empty.
	 * 
	 * @throws ArrayINdexOutOfBoundsException
	 *             if you try to remove an element in empty list
	 */
	public void remove() {
		try {
			if (towhere == 0) {
				throw new ArrayIndexOutOfBoundsException();
			}
			towhere--;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException(
					"The list is empty you can not remove anything.");
		}
	}

	/**
	 * Prints the elements of the list.
	 */
	public void print() {
		for (int i = 0; i < towhere; i++) {
			System.out.println(i + "the number" + list[i].getNum()
					+ " the name " + list[i].getName());

		}
		if (towhere == 0)
			System.out.println("Out.");
	}
}
