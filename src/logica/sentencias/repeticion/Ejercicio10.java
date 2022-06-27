package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * 10) Opera con un número entero positivo que entra por teclado (validar), con
		 * el número ya ingresado y mediante la utilización de un menú ejecutar las
		 * siguientes opciones:
		 * 
		 * 1. Mostrar el número
		 * 
		 * 2. Ingresar un nuevo número (validar)
		 * 
		 * 3. Averiguar si el número es par o impar
		 * 
		 * 4. Calcular la sumatoria de todos los números desde uno hasta dicho número
		 * 
		 * 5. Averiguar si es o no primo
		 * 
		 * 6. Salir
		 * 
		 */

		int numero;
		char opcion;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("INICIA PROGRAMA");
		System.out.println();

		System.out.print("Ingresa un número entero positivo: ");
		numero = scanner.nextInt();
		scanner.nextLine();

		do {

			System.out.println();
			System.out.println(">>>   Menú   <<<");
			System.out.println("1. Mostrar el número");
			System.out.println("2. Ingresar un nuevo número (validar)");
			System.out.println("3. Averiguar si el número es par o impar");
			System.out.println("4. Calcular la sumatoria de todos los números desde uno hasta dicho número");
			System.out.println("5. Averiguar si es o no primo");
			System.out.println("6. Salir");

			System.out.println();
			System.out.print("Elije una opción: ");
			opcion = scanner.nextLine().charAt(0);

			switch (opcion) {
			case '1':
				System.out.println("El número ingresado fue " + numero);
				break;

			case '2':
				System.out.print("Ingresa un número entero positivo: ");
				numero = scanner.nextInt();
				scanner.nextLine();
				break;

			case '3':
				String textoCaso3;
				if (numero % 2 == 0) {
					textoCaso3 = "El número " + numero + " es Par";
				} else {
					textoCaso3 = "El número " + numero + " es Impar";
				}

				System.out.println(textoCaso3);
				break;

			case '4':
				int sumatoria;
				sumatoria = 0;
				for (int i = 1; i <= numero; i++) {
					sumatoria += i;
				}
				System.out.println("La sumatoria de todos los números desde 1 hasta el " + numero + " es " + sumatoria);
				break;

			case '5':
				int raizCuadrada;
				String textoCaso5;

				raizCuadrada = (int) Math.sqrt(numero);
				textoCaso5 = "El número " + numero + " Es primo";

				for (int i = 2; i <= raizCuadrada; i++) {

					if (numero % i == 0) {
						textoCaso5 = "El número " + numero + " No es primo";
					}

				}

				System.out.println(textoCaso5);
				break;

			default:
				System.out.println("Opción incorrecta. Elije entre 1 y 6. ");
				break;
			}

			System.out.println("Presione Enter para continuar...");
			scanner.nextLine();

		} while (opcion != '6');

		System.out.println();
		System.out.println("FIN DEL PROGRAMA");

	}

}
