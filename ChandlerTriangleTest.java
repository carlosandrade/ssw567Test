import static org.junit.Assert.*;

import org.junit.Test;


public class ChandlerTriangleTest {

	@Test
	public void test() {
		ChandlerTriangle ct=new ChandlerTriangle();
		assertEquals("This triangle is equilateral.",ct.checkResultMessage("2.0", "2.0","2.0"));
		assertEquals("This triangle is isosceles.",ct.checkResultMessage("2.5", "3.5","3.5"));
		assertEquals("This triangle is scalene.",ct.checkResultMessage("3.5", "4.5","5.5"));
		assertEquals("Not a triangle.",ct.checkResultMessage("1.0", "2.0","3.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("1.0", "2.0","4.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("0.0", "4.0","4.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("4.0", "0.0","4.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("4.0", "4.0","0.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("-3.0", "3.0","4.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("3.0", "-3.0","4.0"));
		assertEquals("Not a triangle.",ct.checkResultMessage("3.0", "3.0","-4.0"));
		assertEquals("Invalid input number.",ct.checkResultMessage("1.a", "2.0","4.0"));
		assertEquals("Invalid input number.",ct.checkResultMessage("1.0", "2.a","4.0"));
		assertEquals("Invalid input number.",ct.checkResultMessage("1.0", "2.0","4.a"));
		assertEquals("This triangle is equilateral.",ct.checkResultMessage("1e400", "1e400","1e400"));
		assertEquals("This triangle is equilateral.",ct.checkResultMessage("1e-400", "1e-400","1e-400"));
	}

}
