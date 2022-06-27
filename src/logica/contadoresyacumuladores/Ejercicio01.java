package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio01 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		/*
		 * 1) Elabora una solución lógica que le permita al usuario ingresar n
		 * registros, cada uno de estos contiene el nombre y el sexo de una persona. Es
		 * necesario mostrar el nombre de cada persona y averiguar cuántas son mujeres y
		 * cuántos son hombres.
		 */

		int n, contadorMujeres, contadorHombres;
		char sexo;
		String nombre;

		contadorMujeres = 0;
		contadorHombres = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Cuántos registros vas a ingresar?: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Ingrese el nombre: ");
			scanner.nextLine();
			nombre = scanner.nextLine();

			System.out.print("Ingrese el sexo:   ");
			sexo = scanner.next().charAt(0);

			if (sexo == 'f') {
				contadorMujeres++;
			} else {
				contadorHombres++;
			}
		}

		System.out.println();
		System.out.println("Se registraron " + contadorMujeres + " mujeres y " + contadorHombres + " hombres");

	}

}
