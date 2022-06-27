package logica.sentencias.repeticion;

import java.util.Scanner;

public class EjercicioExtra01 {

	public static void main(String[] args) {

		System.out.println("PROGRAMA");

		/*
		 * Triángulo
		 */

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Por favor, ingrese un número: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("FIN DEL PROGRAMA");

	}

}
