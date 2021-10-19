package main.java.shape;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.shape.Circulo;

public class CirculoTest {

	@Test
	public void test() {
		Circulo cr = new Circulo();
		cr.setRaio(5.2);
		double expected = 84.949;
		double actual = cr.AreaDoCirculo(cr.getRaio(),cr.getPi());
		assertEquals(expected,actual,0.001);
	}

}
