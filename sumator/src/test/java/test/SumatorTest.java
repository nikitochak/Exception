package test;

import org.junit.Test;

import com.sirma.itt.javacourse.sumator.Sum;




/**
 * Tests the methods in Sum.
 * 
 * @author Nikolay Ch
 * 
 */
public class SumatorTest {

	/**
	 * If the customer enters a String with not only numbers the compiler should catch an Exception. 
	 * But it must be set in the input method. It prints the value of the inputed string 
	 * which must be with only numbers. 
	 * 
	 */
	@Test
	public void TestInput() {
		String testin = Sum.input();
		int convertedToInt = Integer.parseInt(testin);
		System.out.println(convertedToInt);

	}
}
