package listelements;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sirma.itt.javacourse.listel.Data;
import com.sirma.itt.javacourse.listel.List;
 
/**
 * 
 * Test all methods before and after the input.
 * @author Nikolay Ch
 *
 */
public class ListTest {
	List array=new List(5);
	Data some=new Data();
	@Test
	public void TestInsert() {
		System.out.println("Before insert.");
		array.print();
		array.remove();
		some.setName("ivan");
		some.setNum(43);
		array.add(some);
		System.out.println("After Insert.");
		array.print();
		array.remove();
	}

}
