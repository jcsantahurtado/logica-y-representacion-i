package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * 8) Ingresa números enteros positivos (validar) hasta que entre un 9999 (dato
		 * centinela). Debes mostrar:
		 * 
		 * a) Cada número acompañado de un texto que diga si es par o impar
		 * 
		 * b) La media de los números pares
		 * 
		 * c) Averiguar cuál es el mayor de los pares
		 * 
		 * d) La media de los números impares comprendidos entre 100 y 200
		 */

		int numero, datoCentinela, numeroParMayor, acumuladorSumaNumerosPares, contadorNumerosPares,
				acumuladorSumaNumerosImpares, contadorNumerosImpares;
		float mediaNumerosPares, mediaNumerosImpares;
		String texto;

		numero = 0;
		datoCentinela = 9999;
		contadorNumerosPares = 0;
		acumuladorSumaNumerosPares = 0;
		numeroParMayor = 0;
		contadorNumerosImpares = 0;
		acumuladorSumaNumerosImpares = 0;
		mediaNumerosPares = 0;

		Scanner scanner = new Scanner(System.in);

		while (numero != datoCentinela) {

			do {

				System.out.print("Ingresa un número entero positivo (o 9999 para salir): ");
				numero = scanner.nextInt();

			} while (numero <= 0);

			if (numero == datoCentinela) {
				break;
			}

			if (numero % 2 == 0) {

				texto = "Par";
				contadorNumerosPares++;
				acumuladorSumaNumerosPares += numero;

				if (numero > numeroParMayor) {
					numeroParMayor = numero;
				}

			} else {
				texto = "Impar";
			}

			System.out.println("El número " + numero + " es " + texto);

		}

		scanner.close();

		for (int i = 100; i < 200; i++) {
			if (i % 2 != 0) {
				contadorNumerosImpares++;
				acumuladorSumaNumerosImpares += i;
			}
		}

		if (contadorNumerosPares > 0) {
			mediaNumerosPares = (float) acumuladorSumaNumerosPares / contadorNumerosPares;
		}

		mediaNumerosImpares = (float) acumuladorSumaNumerosImpares / contadorNumerosImpares;

		System.out.println();

		System.out.println("La media de los números pares ingresados es de " + mediaNumerosPares);

		System.out.println("El número mayor de los pares es " + numeroParMayor);

		System.out.println("La media de los números impares comprendidos entre 100 y 200 es: " + mediaNumerosImpares);

		System.out.println("FIN DEL PROGRAMA");

	}

}
