import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TriangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testIsItARightTriangle(){
		double a=-1,b=2,c=2;
		assertFalse(CarlosTriangleProgram.isItARightTriangle(a,b,c));
	}
	@Test
	public void testIsItIsosceles()
	{
		double a=-1,b=2,c=2;
		assertEquals("The triangle is isosceles",CarlosTriangleProgram.whatTypeOfTriangleIsThis(a,b,c));
	}
	
}
