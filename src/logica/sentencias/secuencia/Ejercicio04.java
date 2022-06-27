package logica.sentencias.secuencia;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * Supón que un individuo desea invertir su capital en un banco y quiere saber
		 * cuánto dinero ganará después de un mes si el banco paga a razón de 3%
		 * mensual.
		 */

		double valorInvertir, valorGanado;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese su capital a invertir ($): ");
		valorInvertir = Double.parseDouble(scanner.next());
		
		valorGanado = valorInvertir * .03;
		
//		valor - 100
//		x     - .03
//		
//		valor*.03 = 100x
//		(valor*.03)/100 = x

		System.out.println("Usted ganará $" + valorGanado + " después de un mes. Este banco paga 3% mensual.");

	}

}
