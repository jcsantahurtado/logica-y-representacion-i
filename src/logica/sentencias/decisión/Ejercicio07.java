package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		/*
		 * 7) Crea un algoritmo que permita mostrar, en orden ascendente y descendente,
		 * tres números diferentes que entran por teclado
		 */

		double numero1, numero2, numero3, numeroMenor, numeroMediano, numeroMayor;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número:   ");
		numero1 = Double.parseDouble(scanner.next());

		System.out.print("Ingrese otro número: ");
		numero2 = Double.parseDouble(scanner.next());

		System.out.print("Ingrese otro número: ");
		numero3 = Double.parseDouble(scanner.next());

		if (numero1 < numero2 && numero1 < numero3) {
			numeroMenor = numero1;

			if (numero2 > numero3) {
				numeroMayor = numero2;
				numeroMediano = numero3;
			} else {
				numeroMayor = numero3;
				numeroMediano = numero2;
			}

		} else if (numero2 < numero3) {
			numeroMenor = numero2;

			if (numero1 > numero3) {
				numeroMayor = numero1;
				numeroMediano = numero3;
			} else {
				numeroMayor = numero3;
				numeroMediano = numero1;
			}

		} else {
			numeroMenor = numero3;

			if (numero1 > numero2) {
				numeroMayor = numero1;
				numeroMediano = numero2;
			} else {
				numeroMayor = numero2;
				numeroMediano = numero1;
			}

		}

		System.out.println();
		System.out.println("Ascendente");
		System.out.println(numeroMenor);
		System.out.println(numeroMediano);
		System.out.println(numeroMayor);

		System.out.println();
		System.out.println("Descendente");
		System.out.println(numeroMayor);
		System.out.println(numeroMediano);
		System.out.println(numeroMenor);

	}

}
