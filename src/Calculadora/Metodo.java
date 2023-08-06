package Calculadora;

public class Metodo {
	double resultado;
	double retorno;
	public double Sumar(double a, double b) {
		 resultado = a + b;
		 retorno = Math.round((resultado*100.00))/100.00;
		 return retorno;
		 
	}
	public double Restar(double a, double b) {
		 resultado = a - b;
		 retorno = Math.round((resultado*100.00))/100.00;
		 return retorno;
		 
	}
	public double Multiplicar(double a, double b) {
		 resultado = a * b;
		 retorno = Math.round((resultado*100.00))/100.00;
		 return retorno;
		 
	}
	public double Dividir(double a, double b) {
		 resultado = a + b;
		 retorno = Math.round((resultado*100.00))/100.00;
		 return retorno;
		 
	}
}
