package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * Realiza un algoritmo que lea el nombre y el sexo de cada persona de una
		 * pareja. Se requiere intercambiar de dato a los campos variables que almacenan
		 * los nombres. También debes presentar todos los datos antes y después del
		 * intercambio.
		 */

		String nombre1, nombre2, variableAux;
		char sexo1, sexo2;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre de la primera persona: ");
		nombre1 = scanner.next();
		System.out.print("Ingrese el sexo de la primera persona: ");
		sexo1 = scanner.next().charAt(0);

		System.out.print("Ingrese el nombre de la segunda persona: ");
		nombre2 = scanner.next();
		System.out.print("Ingrese el sexo de la segunda persona: ");
		sexo2 = scanner.next().charAt(0);

		System.out.println(nombre1 + ", " + sexo1 + " -- " + nombre2 + ", " + sexo2);

		variableAux = nombre1;
		nombre1 = nombre2;
		nombre2 = variableAux;

		System.out.println(nombre1 + ", " + sexo1 + " -- " + nombre2 + ", " + sexo2);

	}

}
