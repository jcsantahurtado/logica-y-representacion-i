package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * 5) Descubre cuál es el nombre del más joven de 3 hermanos, quienes tienen
		 * edades diferentes.
		 */

		String nombre1, nombre2, nombre3, nombreMasJoven;
		int edad1, edad2, edad3, edadMasJoven;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre del primer hermano:  ");
		nombre1 = scanner.next();
		System.out.print("Ingrese la edad del primer hermano:    ");
		edad1 = Integer.parseInt(scanner.next());

		System.out.print("Ingrese el nombre del segundo hermano: ");
		nombre2 = scanner.next();
		System.out.print("Ingrese la edad del segundo hermano:   ");
		edad2 = Integer.parseInt(scanner.next());

		System.out.print("Ingrese el nombre del tercer hermano: ");
		nombre3 = scanner.next();
		System.out.print("Ingrese la edad del tercer hermano:   ");
		edad3 = Integer.parseInt(scanner.next());

		if (edad1 < edad2 && edad1 < edad3) {

			edadMasJoven = edad1;
			nombreMasJoven = nombre1;

		} else {

			if (edad2 < edad3) {
				edadMasJoven = edad2;
				nombreMasJoven = nombre2;
			} else {
				edadMasJoven = edad3;
				nombreMasJoven = nombre3;
			}
		}

		System.out.println();
		System.out.println("El hermano más joven es " + nombreMasJoven + " con " + edadMasJoven + " años");

	}

}
