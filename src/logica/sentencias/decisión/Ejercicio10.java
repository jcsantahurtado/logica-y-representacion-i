package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * 10) Realiza una solución lógica que le permita a un estudiante entrar por
		 * teclado el nombre y el código de la materia que va a nivelar, sabiendo que
		 * (si el código es '1' matemáticas $40000, '2' español $35000, '3' sociales
		 * $30000, '4' ciencias $28000, '5' tecnología $25000). Se debe imprimir el
		 * nombre del estudiante y el valor de la nivelación.
		 * 
		 */

		String nombre, materia, error = null;
		char codigo;
		Double valorNivelacion;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor ingrese su nombre y el código de la materia que va a nivelar");

		System.out.print("Ingrese su nombre: ");
		nombre = scanner.next();

		System.out.print("Ingrese el código de la materia: ");
		codigo = scanner.next().charAt(0);

		switch (codigo) {
		case '1':
			materia = "matemáticas";
			valorNivelacion = (double) 40000;
			break;

		case '2':
			materia = "español";
			valorNivelacion = (double) 35000;
			break;

		case '3':
			materia = "sociales";
			valorNivelacion = (double) 30000;
			break;

		case '4':
			materia = "ciencias";
			valorNivelacion = (double) 28000;
			break;

		case '5':
			materia = "tecnología";
			valorNivelacion = (double) 25000;
			break;

		default:
			error = "Error! '" + codigo + "' no es código de ninguna materia...";
			materia = null;
			valorNivelacion = .0;
		}

		if (error == null) {
			System.out.println(nombre + ", para usted poder nivelar " + materia + " debe pagar $" + valorNivelacion);
		} else {
			System.out.println(error);
		}

	}

}