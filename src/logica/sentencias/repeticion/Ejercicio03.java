package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * 3) Elabora una solució lógica que permita generar e imprimir cualquier tabla
		 * de multiplicar con multiplicadores desde el 1 hasta el 10.
		 */

		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("PROGRAMA");

		System.out.print("Por favor, ingrese un número: ");
		n = scanner.nextInt();

		System.out.println("Tabla de múltiplicar del " + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

		System.out.println("...");
		System.out.println("FIN DEL PROGRAMA");

	}

}
