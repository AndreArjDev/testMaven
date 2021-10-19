package main.java.shape;

public class Quadrado {
private double lado;
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double AreaDoQuadrado(double lado) {
		return Math.pow(this.lado,2);
	}
}
