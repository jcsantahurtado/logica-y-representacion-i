package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * 6) Calcula el salario neto de cada uno de los trabajadores de una empresa.
		 * Por cada trabajador se tiene un registro con los datos: nombre, salario
		 * bruto, bonificación y deducción. No se conoce el número de trabajadores.
		 * 
		 */
		String nombre;
		float salarioNeto, salarioBruto, bonificacion, deduccion;
		int respuesta = 1;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("INICIA PROGRAMA");
		System.out.println();

		while (respuesta != 0) {

			System.out.print("Ingrese nombre:        ");
			nombre = scanner.next();

			System.out.print("Ingrese salario bruto: ");
			salarioBruto = scanner.nextFloat();

			System.out.print("Ingrese bonificación:  ");
			bonificacion = scanner.nextFloat();

			System.out.print("Ingrese deducción:     ");
			deduccion = scanner.nextFloat();

			salarioNeto = salarioBruto + bonificacion - deduccion;
			System.out.println("El salario neto de este " + nombre + " es de " + salarioNeto);

			System.out.println();
			System.out.println("Presione:");
			System.out.println("1 - Continuar");
			System.out.println("0 - Salir");
			respuesta = scanner.nextInt();
		}

		System.out.println();
		System.out.println("FIN DEL PROGRAMA");

	}

}
