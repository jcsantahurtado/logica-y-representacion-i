package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio05 {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 5) Elabora un algoritmo que lea un numero entero positivo. Debes calcular el
		 * factorial de n (n!).
		 */

		int numero, resultado;
		resultado = 0;

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.print("Ingrese un numero entero positivo: ");
			numero = scanner.nextInt();

		} while (numero <= 0);

		scanner.close();

		for (int i = 0; i < numero; i++) {

			if (resultado == 0) {

				resultado = numero;

			} else {

				resultado *= i;

			}

		}

		System.out.println();
		System.out.println(numero + "! = " + resultado);

	}

}
