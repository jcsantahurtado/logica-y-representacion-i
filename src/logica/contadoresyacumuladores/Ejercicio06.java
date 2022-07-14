package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio06 {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 6) Crea un algoritmo que permita calcularle el factorial a cada uno de los
		 * primeros x numeros naturales.
		 */

		int numero, contador,resultado;
		resultado = 0;
		contador = 1;

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.print("Ingrese un numero positivo: ");
			numero = scanner.nextInt();

		} while (numero <= 0);

		scanner.close();

		while(contador <= numero) {

			if (resultado == 0) {

				resultado = contador;

			} else {

				resultado *= contador;

			}

			System.out.println(contador + "! = " + resultado);
			
			contador++;

		}

	}

}
