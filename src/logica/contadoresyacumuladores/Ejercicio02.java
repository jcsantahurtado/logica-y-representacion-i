package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 2) Realiza una solución lógica que le permita al usuario ingresar los datos
		 * de n ventas, así: nombre del articulo, número de unidades vendidas y valor
		 * por unidad. Por cada venta se debe enseñar el nombre del artículo y el valor
		 * de la venta. Al final debe aparecer el total vendido por el almacén.
		 */

		int nVentas, uVendidas;
		float vUnidad, vVenta, tVendido;
		String nombreArticulo;

		tVendido = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Cuántos ventas vas a ingresar?: ");
		nVentas = scanner.nextInt();

		for (int i = 0; i < nVentas; i++) {

			System.out.println();

			System.out.print("Nombre del articulo: ");
			scanner.nextLine();
			nombreArticulo = scanner.nextLine();

			System.out.print("Número de unidades vendidas: ");
			uVendidas = scanner.nextInt();

			System.out.print("Valor por unidad: ");
			vUnidad = scanner.nextFloat();

			vVenta = uVendidas * vUnidad;
			tVendido += vVenta;

			System.out.println();
			System.out.println(" - - - DATOS DE VENTA #" + (i + 1) + " - - -");
			System.out.println("Nombre del artículo: " + nombreArticulo);
			System.out.println("Valor de la venta:   " + vVenta);

		}

		System.out.println();
		System.out.println("TOTAL VENDIDO POR ESTE ALMACÉN: " + tVendido);

	}

}
