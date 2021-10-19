package main.java.shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrapezioTest {

	@Test
	public void test() {
		Trapezio tp = new Trapezio();
		tp.setBaseA(3.0);
		tp.setBaseB(4.0);
		tp.setAltura(5.2);
		double expected = 18.200;
		double actual = tp.AreaDoTrapezio(tp.getBaseA(), tp.getBaseB(), tp.getAltura());
		assertEquals(expected,actual,0.001);
	}

}
