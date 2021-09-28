package tav.faeterj;

public class Calculadora {
	
	public double Soma(double x, double y) {
		return x + y;
	}
	
	public double Subtracao(double x, double y) {
		return x - y;
	}
	
	public double Multiplicacao(double x, double y) {
		return x * y;
	}
	
	public double Divisao(double x, double y) {
		return x / y;
	}
	
	public double Raiz (double x) {
		return Math.sqrt(x);
	}
	
	public double Exponenciacao (double x, double y) {
		return Math.pow(x, y);
	}
	
	public double Percentual (double x, double y) {
		return (x/y) * 100; 
	}
}
