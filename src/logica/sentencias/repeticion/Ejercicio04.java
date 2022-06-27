package logica.sentencias.repeticion;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * 4) Realiza una solucion logica que le permita al usuario ingresar los datos
		 * de n ventas, así: nombre del artículo, número de unidades vendidas y valor
		 * por unidad. Por cada venta, se debe mostrar el nombre del artículo, el número
		 * de unidades vendidas, el valor por unidad y el valor de la venta, al igual
		 * que el nombre del artículo de la mayor venta.
		 * 
		 */

		int numeroDeVentas, numeroDeUnidades;
		float valorPorUnidad, ventaMasCara = 0, valorVenta = 0;
		String nombreDelArticulo, nombreMayorVenta = "";

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("PROGRAMA");

		System.out.print("Por favor, ingrese el número de ventas: ");
		numeroDeVentas = scanner.nextInt();

		for (int i = 1; i <= numeroDeVentas; i++) {

			scanner.nextLine();
			System.out.print("Ingrese nombre del artículo: ");
			nombreDelArticulo = scanner.nextLine();

			System.out.print("Ingrse número de unidades vendidas: ");
			numeroDeUnidades = scanner.nextInt();

			System.out.print("Ingrese valor por unidad: ");
			valorPorUnidad = scanner.nextFloat();

			System.out.println();
			valorVenta = numeroDeUnidades * valorPorUnidad;

			System.out.println("--- DATOS DE ESTA VENTA ---");
			System.out.println("Nombre producto:   " + nombreDelArticulo);
			System.out.println("Unidades vendidas: " + numeroDeUnidades);
			System.out.println("Valor por unidad:  " + valorPorUnidad);
			System.out.println("Valor de la venta: " + valorVenta);

			System.out.println();

			if (ventaMasCara < valorVenta) {

				ventaMasCara = valorVenta;
				nombreMayorVenta = nombreDelArticulo;

			}
		}

		System.out.println("El nombre del artículo de la mayor venta fue: " + nombreMayorVenta);

		System.out.println("...");
		System.out.println("FIN DEL PROGRAMA");

	}

}
