package com.sirma.itt.javacourse.listel;

import org.junit.Test;

/**
 * Tests the methods in List class.
 * 
 * @author Nikolay Ch
 */
public class ListExcTest {
	List array = new List(0);
	Data some = new Data();

	/**
	 * Tests the remove method.Must pass because it expects
	 * ArrayINdexOutOfBoundsException and it tries to remove an element form
	 * empty list.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testRemove() {
		array.remove();

	}

	/**
	 * Tests the insert method. Must pass because it expects
	 * ArrayIndexOutOfBoundsException and it tries to insert new element in full
	 * list.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testInsert() {
		some.setName("ivan");
		some.setNum(43);
		array.add(some);
	}

}
