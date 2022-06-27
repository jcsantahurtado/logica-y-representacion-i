package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * 8) Ingresa por teclado números enteros positivos (validar) hasta que entre un
		 * 9999 (dato centinela). Es necesario mostrar cada número acompañado de un
		 * texto que diga si es par o impar.
		 * 
		 */
		int numero, numeroCentinela;
		String texto;

		numero = 0;
		numeroCentinela = 9999;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("INICIA PROGRAMA");
		System.out.println();

		while (numero != numeroCentinela) {

			System.out.print("Digite números enteros positivos (o 9999 para salir): ");
			numero = scanner.nextInt();

			if (numero == 9999) {
				break;
			} else {
				if (numero % 2 == 0) {
					texto = "Par";
				} else {
					texto = "Impar";
				}
				System.out.println("En número " + numero + " es " + texto);
				System.out.println();
			}

		}

		System.out.println();
		System.out.println("FIN DEL PROGRAMA");

	}

}
