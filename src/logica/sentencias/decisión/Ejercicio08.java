package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * 8) Haz un algoritmo que permita imprimir el nombre del día de la semana con
		 * solo digitar la letra inicial del nombre del día ('l' lunes, 'm' martes, w'
		 * miércoles, 'T' jueves, 'v' viernes, 's' sábado, 'd' domingo). Si es un
		 * carácter diferente a los anotados, se debe imprimir un mensaje de "Error".
		 */

		char letra;
		String mensaje;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor ingrese la letra inicial del nombre del día");

		System.out.print("Ingrese letra: ");
		letra = scanner.next().toLowerCase().charAt(0);

		switch (letra) {
		case 'l':
			mensaje = "lunes";
			break;

		case 'm':
			mensaje = "martes";
			break;

		case 'w':
			mensaje = "miércoles";
			break;

		case 'j':
			mensaje = "jueves";
			break;

		case 'v':
			mensaje = "viernes";
			break;

		case 's':
			mensaje = "sábado";
			break;

		case 'd':
			mensaje = "domingo";
			break;

		default:
			mensaje = "Error! '" + letra + "' no es inicial nombre de ningún día...";
		}

		System.out.println(mensaje);

	}

}