package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		/*
		 * Crea un algoritmo que permita hallar tres números consecutivos cuya suma sea
		 * igual a un número que ingresa por teclado.
		 */

		double numeroIngresado, numeroHallado1, numeroHallado2, numeroHallado3;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		numeroIngresado = Double.parseDouble(scanner.next());

//		x + x + 1 x + 2 = num
//		3x + 3 = num
//		3x = num - 3
//		x = (num - 3) / 3

		numeroHallado1 = (numeroIngresado - 3) / 3;
		numeroHallado2 = numeroHallado1 + 1;
		numeroHallado3 = numeroHallado1 + 2;

		System.out.println("El número ingresado fue: " + numeroIngresado);
		System.out.println();
		System.out.println(String.format("Los números consecutivos hayados fueron %.1f, %.1f, %.1f",

				numeroHallado1, numeroHallado2, numeroHallado3));

		System.out.println("...y la suma de estos números da "

				+ (numeroHallado1 + numeroHallado2 + numeroHallado3) +

				" igual a " + numeroIngresado + ", número ingresado");

	}

}
