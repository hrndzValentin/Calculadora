package Calculadora;

import java.util.Scanner;

public class Calculadora {

	static Scanner escaner = new Scanner(System.in);
	static Metodo metodo = new Metodo();
	
	public static void main(String[] args) {
		
		char respuesta;
		do {
			System.out.println("numero 1");
			double a = escaner.nextDouble();
			
			System.out.println("numero 2");
			double b = escaner.nextDouble();
			
			System.out.println("Tipo de operacion");
			String operacion = escaner.next();
			
			switch (operacion) {
			case "sumar":
				double suma = metodo.Sumar(a, b);
				System.out.println("salida : " + suma);
				break;
			
			case "restar":
				double resta = metodo.Restar(a, b);
				System.out.println("salida : " + resta);
				break;
				
			case "multiplicar":
				double multiplicacion = metodo.Multiplicar(a, b);
				System.out.println("salida : " + multiplicacion);
				break;
			
			case "Dividir":
				double divicion = metodo.Restar(a, b);
				System.out.println("salida : " + divicion);
				break;
				
			}
			
			System.out.println("Desea terminar ya el programa ? responda Y o N");
			respuesta = escaner.next().charAt(0);
			
		} while(respuesta == 'N');
		
	
	}

}
