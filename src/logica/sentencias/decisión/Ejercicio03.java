package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * 3) Averigua cuál es el nombre y la edad del más joven de 2 hermanos no
		 * mellizos.
		 */

		String nombre1, nombre2, nombreMasJoven;
		int edad1, edad2, edadMasJoven;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre del primer hermano: ");
		nombre1 = scanner.next();

		System.out.print("Ingrese la edad del primer hermano: ");
		edad1 = Integer.parseInt(scanner.next());

		System.out.print("Ingrese el nombre del segundo hermano: ");
		nombre2 = scanner.next();

		System.out.print("Ingrese la edad del segundo hermano: ");
		edad2 = Integer.parseInt(scanner.next());

		if (edad1 < edad2) {
			edadMasJoven = edad1;
			nombreMasJoven = nombre1;
		} else {
			edadMasJoven = edad2;
			nombreMasJoven = nombre2;
		}
		
		System.out.println();
		System.out.println("El hermano más joven es " + nombreMasJoven + " con " + edadMasJoven + " años");

	}

}
