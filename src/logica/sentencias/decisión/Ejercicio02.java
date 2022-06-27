package logica.sentencias.decisión;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * 2) Elabora una solución lógica en la que se lea la cantidad de libras de
		 * carne a comprar y el valor de cada libra. Si la cantidad de libras es 3 o
		 * menos no tiene descuento, de lo contrario, tiene un descuento del 20%. Debes
		 * imprimir el valor sin descuento, el valor del descuento y el valor a pagar.
		 */

		int librasCarne;
		double valorLibra, valorSinDescuento, valorDescuento, valorAPagar;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de libras de carne a comprar: ");
		librasCarne = Integer.parseInt(scanner.next());

		System.out.print("Ingrese el valor de cada libra: ");
		valorLibra = Integer.parseInt(scanner.next());

		valorSinDescuento = librasCarne * valorLibra;

		if (librasCarne <= 3) {
			valorDescuento = 0;
		} else {
			valorDescuento = valorSinDescuento * .2;
		}

		valorAPagar = valorSinDescuento - valorDescuento;

		System.out.println("El valor sin descuento es de " + valorSinDescuento);
		System.out.println("El valor del descuento es de " + valorDescuento);
		System.out.println("El valor a pagar es de " + valorAPagar);

	}

}
