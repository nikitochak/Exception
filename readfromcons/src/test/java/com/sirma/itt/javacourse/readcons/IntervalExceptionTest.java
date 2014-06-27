package com.sirma.itt.javacourse.readcons;

import org.junit.Test;

/**
 * 
 * Tests the NotInIntervalException which is declared from me.
 * 
 * @author Nikolay Ch
 * 
 */
public class IntervalExceptionTest {

	/**
	 * Tests the exception for invalid interval. Must pass.
	 * 
	 * @throws NotInIntervalException
	 */
	@Test(expected = NotInIntervalException.class)
	public void testInsert() throws NotInIntervalException {
		Read.insert(-1243);

	}

}
