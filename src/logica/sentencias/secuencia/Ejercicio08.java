package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * Haz un algoritmo que permita hallar el número de meses que han transcurrido
		 * entre los inicios de dos años cualquiera. Deben entrar por teclado.
		 */

		int anioInicial, anioFinal, diferenciaEnMeses;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- PROGRAMA ---");
		System.out.println("Hallar el número de meses que han transcurrido entre los inicios de dos años");

		System.out.print("Ingrese un primer año: ");
		anioInicial = Integer.parseInt(scanner.next());

		System.out.print("Ingrese un segundo año: ");
		anioFinal = Integer.parseInt(scanner.next());

		diferenciaEnMeses = (anioFinal - anioInicial) * 12;

		System.out.println("Entre el año " + anioInicial + " y el año " + anioFinal + " han transcurrido "
				+ diferenciaEnMeses + " meses");

	}

}
