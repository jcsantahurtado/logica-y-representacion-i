package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		/*
		 * 9) Haz la validación para ingresar por teclado el sexo de una persona, es
		 * decir, que solo permita entrar el carácter 'f' (femenino) o 'm' (masculino).
		 * 
		 */
		char sexo;
		sexo = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("INICIA PROGRAMA");
		System.out.println();

		do {

			System.out.print("Ingrese el sexo de una persona (f o m): ");
			sexo = scanner.next().charAt(0);

		} while (sexo != 'f' && sexo != 'm');

		System.out.println("Es correcto! Sexo ingresado: " + sexo);

		System.out.println();
		System.out.println("FIN DEL PROGRAMA");

	}

}
