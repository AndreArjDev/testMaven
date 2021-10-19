package main.java.shape;

public class Retangulo {
	private double ladoA;
	private double ladoB;
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public double AreaDoRetangulo(double ladoA, double ladoB) {
		return this.ladoA * this.ladoB;
	}
}
