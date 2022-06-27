package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * 1) Haz una solución lógica que permita ingresar n números enteros por
		 * teclado. Además, se debe mostrar por pantalla cada número acompañado de un
		 * texto que diga si es neutro (cero), positivo o negativo.
		 */

		int n, numeroIngresado;
		String texto;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("PROGRAMA");

		System.out.print("Por favor, cuántos números va a ingresar? ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Ingrese numero: ");
			numeroIngresado = scanner.nextInt();

			if (numeroIngresado == 0) {
				texto = "neutro";
			} else {

				if (numeroIngresado < 0) {
					texto = "negativo";
				} else {
					texto = "positivo";
				}
			}
			
			System.out.println("El número ingresado es " +  texto);
			System.out.println();
		}
		
		System.out.println("FIN DEL PROGRAMA");

	}

}
