package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * 4) Realiza una solución lógica en la que se lean dos números diferentes y se
		 * impriman en forma:
		 * 
		 * a) Ascendente
		 * 
		 * b) Descendente
		 */

		int numero1, numero2, numeroMenor, numeroMayor;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		numero1 = Integer.parseInt(scanner.next());

		System.out.print("Ingrese un número diferente: ");
		numero2 = Integer.parseInt(scanner.next());

		if (numero1 < numero2) {
			numeroMenor = numero1;
			numeroMayor = numero2;
		} else {
			numeroMenor = numero2;
			numeroMayor = numero1;
		}

		System.out.println("Ascendente");
		System.out.println(numeroMenor);
		System.out.println(numeroMayor);

		System.out.println("Descendente");
		System.out.println(numeroMayor);
		System.out.println(numeroMenor);

	}

}
