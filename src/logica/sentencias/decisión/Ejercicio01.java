package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * 1) Calcula el valor de una llamada telefónica, teniendo en cuenta que si la
		 * duración de la llamada es de 3 minutos o menos vale $500 y cada minuto
		 * adicional vale $100.
		 */

		int minutos;
		double valorLlamada = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la duración de la llamada en minutos: ");
		minutos = Integer.parseInt(scanner.next());
		
		if (minutos >= 3) {
			valorLlamada += 500;
			minutos -= 3;
		}
		System.out.println(minutos);
		
		valorLlamada += (minutos * 100);

		System.out.println("El valor de una llamada telefónica es de " + valorLlamada);		

	}

}
