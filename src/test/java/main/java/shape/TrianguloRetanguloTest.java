package main.java.shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloRetanguloTest {

	@Test
	public void test() {
		TrianguloRetangulo tr = new TrianguloRetangulo();
		tr.setBase(3.0);
		tr.setAltura(5.2);
		double expected = 7.800;
		double actual = tr.areaDoTriangulo(tr.getBase(), tr.getAltura());
		assertEquals(expected,actual,0.001);
	}

}
