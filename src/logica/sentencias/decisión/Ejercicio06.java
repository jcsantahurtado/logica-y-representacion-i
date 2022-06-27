package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * 6) Halla de entre tres personas cuál es el nombre y la estatura de la persona
		 * más alta, teniendo presente que cada una tiene estatura diferente.
		 */

		String persona1, persona2, persona3, personaMasAlta;
		double estatura1, estatura2, estatura3, estaturaMayor;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre de la primera persona:   ");
		persona1 = scanner.next();
		System.out.print("Ingrese la estatura de la primera persona: ");
		estatura1 = Double.parseDouble(scanner.next());

		System.out.print("Ingrese el nombre de la segunda persona:   ");
		persona2 = scanner.next();
		System.out.print("Ingrese la estatura de la segunda persona: ");
		estatura2 = Double.parseDouble(scanner.next());

		System.out.print("Ingrese el nombre de la tercera persona:   ");
		persona3 = scanner.next();
		System.out.print("Ingrese la estatura de la tercera persona: ");
		estatura3 = Double.parseDouble(scanner.next());

		if (estatura1 > estatura2 && estatura1 > estatura3) {

			personaMasAlta = persona1;
			estaturaMayor = estatura1;

		} else {

			if (estatura2 > estatura3) {

				personaMasAlta = persona2;
				estaturaMayor = estatura2;

			} else {

				personaMasAlta = persona3;
				estaturaMayor = estatura3;
			}

		}

		System.out.println();
		System.out.println("La persona más alta es " + personaMasAlta + " con " + estaturaMayor + " metros");

	}

}
