package logica.sentencias.repeticion;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {

		int num;
		char opc;
		Scanner scanner = new Scanner(System.in);

		num = extracted(scanner);

		do {

			opc = menu(scanner);

			switch (opc) {
			case '1':
				System.out.println(opc);
				break;

			case '2':
				System.out.println(opc);
				break;

			case '3':
				System.out.println(opc);
				break;

			case '4':
				System.out.println(opc);
				break;

			default:
				break;
			}

		} while (opc != '4');

		System.out.println("Salió. Número " + num);

	}

	private static int extracted(Scanner scanner) {
		int numero;
		do {

			System.out.print("Ingrese: ");
			numero = scanner.nextInt();
			scanner.nextLine();

		} while (numero == 0);

		return numero;

	}

	private static char menu(Scanner scanner) {

		char opcion;

		System.out.println("--- Menú ---");
		System.out.println("1. Opción 1");
		System.out.println("2. Opción 2");
		System.out.println("3. Opción 3");
		System.out.println("4. Salir");

		do {

			System.out.print("Elije una opción: ");
			opcion = scanner.nextLine().charAt(0);

		} while (opcion < '1' || opcion > '4');

		return opcion;

	}

}
