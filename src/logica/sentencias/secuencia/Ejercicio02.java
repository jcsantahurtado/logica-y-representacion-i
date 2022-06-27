package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * Haz una solución lógica (algoritmo) que permita incrementar el contenido de
		 * un campo variable de tipo numérico en una cantidad variable, que también
		 * entra por teclado. Debes mostrar el dato antes y después del incremento
		 */

		int numero, valorAIncrementar, valorDespuesDeIncremento;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número entero: ");
		numero = Integer.parseInt(scanner.next());
		System.out.println("El número ingresado fue: " + numero);

		System.out.print("Ingrese un el valor a incrementar: ");
		valorAIncrementar = Integer.parseInt(scanner.next());

		valorDespuesDeIncremento = numero + valorAIncrementar;

		System.out.println("El número después del incremento es: " + valorDespuesDeIncremento);

	}

}
