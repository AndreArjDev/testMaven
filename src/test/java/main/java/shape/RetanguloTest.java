package main.java.shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetanguloTest {

	@Test
	public void test() {
		Retangulo rt  =new Retangulo();
		rt.setLadoA(3.0);
		rt.setLadoB(4.0);
		double expected = 12.000;
		double actual= rt.AreaDoRetangulo(rt.getLadoA(), rt.getLadoB());
		assertEquals(expected,actual,0.001);
	}

}
