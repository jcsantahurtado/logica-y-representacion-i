package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 3) Se tienen n registros y cada uno contiene: cédula, nombre, horas
		 * trabajadas, valor hora trabajada y porcentaje de deducción. Se pide exhibir
		 * 
		 * a) La cédula, el nombre y el salario devengado por cada empleado
		 * 
		 * b) Monto total de deducciones
		 * 
		 * c) Cuánto pagó la empresa por concepto de salarios
		 */

		int nRegistros, horasTrabajadas;
		float valorHora, porcentajeDeduccion, valorDeducion, totalDeduciones, salarioNetoTrabajador, salarioFinalTrabajador, nominaEmpresa;
		String cedulaTrabajador, nombreTrabajador;
		
		totalDeduciones = 0;
		nominaEmpresa = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Cuántos registros vas a ingresar?: ");
		nRegistros = scanner.nextInt();

		for (int i = 0; i < nRegistros; i++) {

			System.out.println();

			System.out.print("Nombre del trabajador: ");
			scanner.nextLine();
			nombreTrabajador = scanner.nextLine();

			System.out.print("Cédula del trabajador: ");
			cedulaTrabajador = scanner.nextLine();

			System.out.print("Horas trabajadas: ");
			horasTrabajadas = scanner.nextInt();
			
			System.out.print("Valor hora trabajada: ");
			valorHora = scanner.nextFloat();
			
			System.out.print("Porcentaje de deducción: ");
			porcentajeDeduccion = scanner.nextFloat();
			
			salarioNetoTrabajador = horasTrabajadas * valorHora;
			valorDeducion = salarioNetoTrabajador * porcentajeDeduccion / 100;
			salarioFinalTrabajador = salarioNetoTrabajador - valorDeducion;
			
			totalDeduciones += valorDeducion;
			nominaEmpresa += salarioFinalTrabajador;

			System.out.println();
			System.out.println(" - - - COMPRIBANTE DE PAGO #" + (i + 1) + " - - -");
			System.out.println("Cédula del empleado:   " + cedulaTrabajador);
			System.out.println("Nombre del empleado: " + nombreTrabajador);
			System.out.println("Salario devengado: " + salarioFinalTrabajador);

		}

		System.out.println();
		System.out.println("Monto total de deducciones: " + totalDeduciones);
		System.out.println("La empresa por concepto de salarios pagó: " + nominaEmpresa);

	}

}
