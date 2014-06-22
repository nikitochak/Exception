package test;

import org.testng.annotations.Test;

import com.sirma.itt.javacourse.readcons.*;

/**
 * 
 * Tests if the method for inserting is working properly.
 * @author Nikolay Ch
 *
 */
public class IntervalTest {
  /**
   * Tests with a number which the method must process.  
   */
@Test
  public void TestInsert() {
	  
	  System.out.println("The old one: -1234");
	  
	  System.out.println("The new one: "+Read.insert(-1324));
  }
}
