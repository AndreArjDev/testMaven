package main.java.shape;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
				double a,b,c;
				
				TrianguloRetangulo tr = new TrianguloRetangulo();
				Circulo cr = new Circulo();
				Trapezio tp = new Trapezio();
				Quadrado qd = new Quadrado();
				Retangulo rt = new Retangulo();
				Scanner teclado = new Scanner(System.in);		
				a = teclado.nextDouble();
				b = teclado.nextDouble();
				c = teclado.nextDouble();
				tr.setBase(a);
				tr.setAltura(c);
				cr.setRaio(c);
				tp.setBaseA(a);
				tp.setBaseB(b);
				tp.setAltura(c);
				qd.setLado(b);
				rt.setLadoA(a);
				rt.setLadoB(b);
				teclado.close();
				System.out.printf("TRIANGULO: %.3f\n", tr.areaDoTriangulo(a,c));
				System.out.printf("CIRCULO: %.3f\n",cr.AreaDoCirculo(c,cr.getPi()));
				System.out.printf("TRAPEZIO: %.3f\n",tp.AreaDoTrapezio(tp.getBaseA(), tp.getBaseA(), tp.getAltura()));
				System.out.printf("QUADRADO: %.3f\n",qd.AreaDoQuadrado(qd.getLado()));
				System.out.printf("RETANGULO: %.3f\n",rt.AreaDoRetangulo(rt.getLadoA(), rt.getLadoB()));
			}
		

}


