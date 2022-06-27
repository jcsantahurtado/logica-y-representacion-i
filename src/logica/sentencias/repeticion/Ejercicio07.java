package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		/*
		 * 7) Elabora una solución lógica que permita imprimir el nombre del día de la
		 * semana con solo digitar la letra inicial del nombre del día ('l' lunes, 'm'
		 * martes, 'w' miércoles, 'j' jueves, 'v' viernes, 's' sábado, 'd' domingo). Si
		 * es un carácter diferente a los anotados, se debe imprimir un mensaje de
		 * "Error". El programa termina cuando día almacene un asterisco ('*').
		 * 
		 */
		char inicialDia;
		String mensaje;

		inicialDia = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("INICIA PROGRAMA");
		System.out.println();

		while (inicialDia != '*') {

			System.out.println("- Digite un asterisco pasa salir o...");
			System.out.print("- Digite la letra inicial del nombre del día, en minúscula: ");
			inicialDia = scanner.next().charAt(0);

			switch (inicialDia) {
			case '*':
				mensaje = "";
				break;

			case 'l':
				mensaje = "Lunes";
				break;

			case 'm':
				mensaje = "Martes";
				break;

			case 'w':
				mensaje = "Miécoles";
				break;

			case 'j':
				mensaje = "Jueves";
				break;

			case 'v':
				mensaje = "Viernes";
				break;

			case 's':
				mensaje = "Sábado";
				break;

			case 'd':
				mensaje = "Domingo";
				break;

			default:
				mensaje = "Error";
				break;
			}

			System.out.println("  " + mensaje);
			System.out.println();

		}

		System.out.println();
		System.out.println("FIN DEL PROGRAMA");

	}

}
