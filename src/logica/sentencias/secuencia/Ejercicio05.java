package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * Una tienda ofrece un descuento del 15% sobre el total de la compra y un
		 * cliente desea saber cuánto deberá pagar finalmente por su compra.
		 */

		double totalCompra, totalFinal;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el valor de su compra ($): ");
		totalCompra = Double.parseDouble(scanner.next());

		totalFinal = totalCompra * .85;

//		valor - 1
//		x     - .85
//		
//		valor*.85 = 1x
//		(valor*.85)/1 = x

		System.out.println("Por descuento del 15% usted final/ deberá pagara $" + totalFinal);

	}

}
