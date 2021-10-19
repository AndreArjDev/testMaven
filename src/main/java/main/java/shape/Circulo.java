package main.java.shape;

public class Circulo {
	private double raio;
	private double pi = 3.14159;
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
		
	}
		
	public double getPi() {
		return pi;
	}
	public double AreaDoCirculo(double raio,double pi) {
		return this.pi * Math.pow(this.raio, 2);
	}
}
