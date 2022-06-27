package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		/*
		 * 9) Elabora una solución lógica que permita entrar por teclado dos números y
		 * un operador aritmético estándar ('+', '-', '*', '/'). Se deben imprimir los
		 * dos números y el resultado de la operación escogida.
		 * 
		 */

		double numero1, numero2, resultado = 0;
		char operador;
		String error = null;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor ingrese dos números y un operador aritmético estándar");

		System.out.print("Ingrese número 1: ");
		numero1 = Double.parseDouble(scanner.next());

		System.out.print("Ingrese número 2: ");
		numero2 = Double.parseDouble(scanner.next());

		System.out.print("Ingrese operador: ");
		operador = scanner.next().charAt(0);

		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			break;

		case '-':
			resultado = numero1 - numero2;
			break;

		case '*':
			resultado = numero1 * numero2;
			break;

		case '/':
			resultado = numero1 / numero2;
			break;

		default:
			error = "Error! '" + operador + "' no es un operador aritmético estándar...";
		}

		if (error == null) {
			System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);		
		} else {
			System.out.println(error);
		}

	}

}