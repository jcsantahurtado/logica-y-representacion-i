package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 3) Se tienen n registros y cada uno contiene: cédula, nombre, horas
		 * trabajadas, valor hora trabajada y porcentaje de deducción. Se pide exhibir
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
