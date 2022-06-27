package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * Un alumno desea saber cuál será su calificación final en la materia de
		 * inglés, sabiendo que dicha calificación se compone de los siguientes
		 * porcentajes:
		 * 
		 * 50% del promedio de sus tres calificaciones parciales
		 * 
		 * 20% de la calificación de un trabajo final
		 * 
		 * 30% de la calificación del examen final
		 */

		double parcial1, parcial2, parcial3, promedioParciales, trabajoFinal, examenFinal, calificacionFinal;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- PROGRAMA ---");
		System.out.println("Calificación final");
		System.out.println();

		System.out.print("Ingrese calificación parcial 1: ");
		parcial1 = Integer.parseInt(scanner.next());

		System.out.print("Ingrese calificación parcial 2: ");
		parcial2 = Integer.parseInt(scanner.next());

		System.out.print("Ingrese calificación parcial 3: ");
		parcial3 = Integer.parseInt(scanner.next());

		promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
		System.out.println(
				String.format("El promedio de sus tres calificaciones parcialeses es %.2f", promedioParciales));

		System.out.println();

		System.out.print("Ingrese calificación del trabajo final: ");
		trabajoFinal = Integer.parseInt(scanner.next());

		System.out.print("Ingrese calificación del examen final: ");
		examenFinal = Integer.parseInt(scanner.next());

		calificacionFinal = (promedioParciales * .5) + (trabajoFinal * .2) + (examenFinal * .3);

		System.out.println();
		System.out.println(String.format("Su calificación final es %.2f", calificacionFinal));

	}

}
