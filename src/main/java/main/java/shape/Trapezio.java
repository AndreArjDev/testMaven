package main.java.shape;

public class Trapezio {
	private double baseA;
	private double baseB;
	private double altura;
	
	
	public double getBaseA() {
		return baseA;
	}
	public void setBaseA(double baseA) {
		this.baseA = baseA;
	}
	public double getBaseB() {
		return baseB;
	}
	public void setBaseB(double baseB) {
		this.baseB = baseB;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double AreaDoTrapezio(double baseA,double baseB,double altura) {
		return (this.baseA + this.baseB) * altura /2;
	}
}
