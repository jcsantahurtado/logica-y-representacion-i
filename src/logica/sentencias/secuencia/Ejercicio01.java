package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * Elabora la solución lógica (algoritmo) que decremente en uno el contenido de
		 * un campo variable de tipo numérico entero cuyo dato entra por teclado.
		 * Además, es necesario mostrar el dato antes y después del decremento
		 */

		int numero;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número entero: ");
		numero = Integer.parseInt(scanner.next());

		System.out.println("El número ingresado fue: " + numero);

		numero--;

		System.out.println("El número decrementado en uno es: " + numero);

	}

}
