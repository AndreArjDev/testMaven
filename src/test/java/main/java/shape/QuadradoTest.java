package main.java.shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuadradoTest {

	@Test
	public void test() {
		Quadrado qr = new Quadrado();
		qr.setLado(4.0);
		double expected = 16.000;
		double actual = qr.AreaDoQuadrado(qr.getLado());
		assertEquals(expected,actual,0.001);
		
	}

}
