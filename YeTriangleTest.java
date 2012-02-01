import static org.junit.Assert.*;

import org.junit.Test;


public class YeTriangleTest {

	@Test
	public void test() {
		assertEquals("Equilateral.",YeTriangle.isTriangle("2.0", "2.0","2.0"));
		assertEquals("Isosceles.",YeTriangle.isTriangle("2.5", "3.5","3.5"));
		assertEquals("Scalene.",YeTriangle.isTriangle("3.5", "4.5","5.5"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("1.0", "2.0","3.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("1.0", "2.0","4.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("0.0", "4.0","4.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("4.0", "0.0","4.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("4.0", "4.0","0.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("-3.0", "3.0","4.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("3.0", "-3.0","4.0"));
		assertEquals("Not a triangle.",YeTriangle.isTriangle("3.0", "3.0","-4.0"));
		assertEquals("Invalid input.",YeTriangle.isTriangle("1.a", "2.0","4.0"));
		assertEquals("Invalid input.",YeTriangle.isTriangle("1.0", "2.a","4.0"));
		assertEquals("Invalid input.",YeTriangle.isTriangle("1.0", "2.0","4.a"));
		assertEquals("Equilateral.",YeTriangle.isTriangle("1e400", "1e400","1e400"));
		assertEquals("Equilateral.",YeTriangle.isTriangle("1e-400", "1e-400","1e-400"));
	}

}
