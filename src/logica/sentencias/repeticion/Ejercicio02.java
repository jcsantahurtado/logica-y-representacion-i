package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * 2) Genera e imprime los primeros n términos de la serie: 1 5 9 13 17 21...
		 */

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("PROGRAMA");

		System.out.print("Por favor, ingrese número de términos que quiere de la serie: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(4 * i + 1 + " ");
		}

		System.out.println("...");
		System.out.println("FIN DEL PROGRAMA");

	}

}
