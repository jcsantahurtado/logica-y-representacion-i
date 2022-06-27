package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * Elabora un algoritmo que permita dividir un número que entra por teclado en
		 * dos partes tales que una exceda a la otra en 15.
		 */

		double numero, parte1, parte2;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el valor de su compra ($): ");
		numero = Double.parseDouble(scanner.next());

		parte1 = (numero - 15) / 2;
		parte2 = parte1 + 15;

//		x + x + 15 = num
//		2x + 15 = num
//		2x = num - 15
//		x = (num - 15) / 2

		System.out.println("El número ingresado fue: " + numero);
		System.out.println("Se dividió en dos partes");
		System.out.println("Parte 1: " + parte1);
		System.out.println("Parte 2: " + parte2);

		System.out.println("La Parte 2 excede a la Parte 1 en " + (parte2 - parte1));

	}

}
