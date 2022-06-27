package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * 5) Desarrolla una solución lógica que permita mostrar todos los números
		 * enteros consecutivos que hay entre 2 números enteros dados (leidos).
		 * 
		 */

		int numero1, numero2, varAux;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("PROGRAMA");

		System.out.print("Por favor, ingrese un número entero: ");
		numero1 = scanner.nextInt();

		System.out.print("Por favor, ingrese otro número entero: ");
		numero2 = scanner.nextInt();

		if (numero1 > numero2) {

			varAux = numero1;
			numero1 = numero2;
			numero2 = varAux;

		}
		
		System.out.println("Entre " + numero1 + " y " + numero2 + " hay los siguientes números enteros: ");
		for (int i = numero1 + 1; i < numero2; i++) {

			System.out.print(i + " ");

		}

		System.out.println();
		System.out.println("FIN DEL PROGRAMA");

	}

}
