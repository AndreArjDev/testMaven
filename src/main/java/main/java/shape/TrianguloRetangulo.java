package main.java.shape;

public class TrianguloRetangulo {
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	public double areaDoTriangulo(double base, double altura) {
		return this.base* this.altura/2;
	}
}
