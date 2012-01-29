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
		int a=-1,b=2,c=2;
		assertFalse("This should not be a right triangle!",CarlosTriangleProgram.isItARightTriangle(a,b,c));
	}

}
