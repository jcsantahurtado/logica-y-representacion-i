package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		/*
		 * Realiza un algoritmo que resuelva el siguiente problema: Una familia está
		 * compuesta por mamá, papá y un hijo. Es necesario saber:
		 * 
		 * a) Promedio de edad de la familia
		 * 
		 * b) Promedio de edad de los padres
		 * 
		 * c) Cuántos años es mayor el papá que el hijo
		 * 
		 * d) Cuántos años es mayor la mamá que el hijo
		 */

		int edadMama, edadPapa, edadHijo, diferenciaMamaHijo, diferenciaPapaHijo;

		double promedioEdadFamilia, promedioEdadPadres;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la edad de la mamá: ");
		edadMama = scanner.nextInt();

		System.out.print("Ingrese la edad del papá:   ");
		edadPapa = scanner.nextInt();

		System.out.print("Ingrese la edad del hijo:   ");
		edadHijo = scanner.nextInt();

		promedioEdadFamilia = (double) (edadMama + edadPapa + edadHijo) / 3;
		promedioEdadPadres = (double) (edadMama + edadPapa) / 2;

		diferenciaMamaHijo = edadMama - edadHijo;
		diferenciaPapaHijo = edadPapa - edadHijo;

		System.out.println();
		System.out.println(String.format("Promedio de edad de la familia es %.2f", promedioEdadFamilia));
		System.out.println(String.format("Promedio de edad de los padres es %.2f", promedioEdadPadres));
		System.out.println("La mamá es " + diferenciaMamaHijo + " años mayor que el hijo");
		System.out.println("El papá es " + diferenciaPapaHijo + " años mayor que el hijo");

	}

}
