package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio04 {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 4) Haz un algoritmo que lea la base x y el exponente n. Calcula la n-ésima
		 * potencia de x (x^n).
		 */

		int x, n, resultado;
		resultado = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la base: ");
		x = scanner.nextInt();

		System.out.print("Ingrese el exponente: ");
		n = scanner.nextInt();

		scanner.close();

		for (int i = 0; i < n; i++) {

			if (resultado == 0) {

				resultado = x;

			} else {

				resultado *= x;

			}

		}

		System.out.println();
		System.out.println(x + "^" + n + " = " + resultado);

	}

}
