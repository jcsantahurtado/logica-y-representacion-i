package logica.contadoresyacumuladores;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * 7) Realiza una solución lógica que permita leer una cantidad no determinada
		 * de registros, los cuales contienen datos de estudiantes de una universidad.
		 * La estructura de cada registro está compuesta por nombre, sexo, edad y
		 * carrera ('1' Medicina, '2' Odontología, '3' Ing. de Sistemas, '4' Otra). Los
		 * siguientes datos son necesarios:
		 * 
		 * a) El nombre, la edad y la carrera por cada estudiante
		 * 
		 * b) Cuántas mujeres estudian medicina
		 * 
		 * c) Cuántos estudiantes hay en odontología
		 * 
		 * d) Porcentaje que representan las mujeres que estudian ing. de sistemas,
		 * respecto a todos los estudiantes de Ing. de sistemas
		 * 
		 * e) Promedio de edad de los hombres que estudian otra carrera
		 */

		int edad, mujeresEstudianMedicina, estudiantesOdontologia, estudiantesSitemas, mujeresEstudianSistemas,
				cantHombresEstudiantesOtra, sumaEdadHombresEstudiantesOtra;
		float porcetajeMujeresSistemas, promEdadHombresEstudiantesOtra;
		char sexo;
		boolean salir;
		String nombre, carrerra;

		salir = false;
		mujeresEstudianMedicina = 0;
		estudiantesOdontologia = 0;
		mujeresEstudianSistemas = 0;
		estudiantesSitemas = 0;
		porcetajeMujeresSistemas = 0;
		cantHombresEstudiantesOtra = 0;
		cantHombresEstudiantesOtra = 0;
		sumaEdadHombresEstudiantesOtra = 0;
		promEdadHombresEstudiantesOtra = 0;

		Scanner scanner = new Scanner(System.in);

		while (!salir) {

			nombre = obtenerNombre(scanner);

			sexo = obtenerSexo(scanner);

			edad = obtenerEdad(scanner);

			carrerra = obtenerCarrera(scanner);

			System.out.println(nombre + ", tiene " + edad + " años y es estudiante de " + carrerra);

			if (sexo == 'f' && carrerra == "Medicina") {
				mujeresEstudianMedicina++;
			}

			if (carrerra == "Odontología") {
				estudiantesOdontologia++;
			}

			if (carrerra == "Ing. de Sistemas") {
				estudiantesSitemas++;

				if (sexo == 'f') {
					mujeresEstudianSistemas++;
				}
			}

			if (sexo == 'm' && carrerra == "Otra") {
				cantHombresEstudiantesOtra++;
				sumaEdadHombresEstudiantesOtra += edad;
			}

			salir = salir(scanner);

		}

		scanner.close();

		if (estudiantesSitemas != 0) {
			porcetajeMujeresSistemas = mujeresEstudianSistemas * 100 / estudiantesSitemas;
		}

		if (cantHombresEstudiantesOtra != 0) {
			promEdadHombresEstudiantesOtra = (float) sumaEdadHombresEstudiantesOtra / cantHombresEstudiantesOtra;
		}

		System.out.println(mujeresEstudianMedicina + " mujeres estudian Medicina");

		System.out.println(estudiantesOdontologia + " personas estudian Odontología");

		System.out.println(
				"El " + porcetajeMujeresSistemas + "% de las personas que estudian Ing. de Sistemas son mujeres");

		System.out.println(
				promEdadHombresEstudiantesOtra + " es el promedio de edad de los hombres que estudian otra carrera");

		System.out.println("FIN DEL PROGRAMA");

	}

	private static boolean salir(Scanner scanner) {

		char opc;

		System.out.println();
		System.out.print("Ingrese 0 para salir ó 1 para continuar: ");
		opc = scanner.nextLine().charAt(0);

		if (opc == '0') {
			return true;
		} else {
			return false;
		}
	}

	private static String obtenerNombre(Scanner scanner) {
		System.out.print("Nombre: ");
		return scanner.nextLine();
	}

	private static String obtenerCarrera(Scanner scanner) {

		char opcion;
		String opcionNombre;

		opcionNombre = "";

		System.out.println("1. Medicina");
		System.out.println("2. Odontología");
		System.out.println("3. Ing. de Sistemas");
		System.out.println("4. Otra");

		do {

			System.out.print("Carrera: ");
			opcion = scanner.nextLine().charAt(0);

		} while (opcion < '1' || opcion > '4');

		switch (opcion) {
		case '1':
			opcionNombre = "Medicina";
			break;
		case '2':
			opcionNombre = "Odontología";
			break;
		case '3':
			opcionNombre = "Ing. de Sistemas";
			break;
		case '4':
			opcionNombre = "Otra";
			break;

		default:
			break;
		}

		return opcionNombre;
	}

	private static int obtenerEdad(Scanner scanner) {
		int datoIngresado;
		do {

			System.out.print("Edad: ");
			datoIngresado = scanner.nextInt();
			scanner.nextLine();

		} while (datoIngresado < 0);

		return datoIngresado;
	}

	private static char obtenerSexo(Scanner scanner) {

		char opcion;

		do {

			System.out.print("Sexo (f o m): ");
			opcion = scanner.nextLine().charAt(0);

		} while (opcion != 'f' && opcion != 'm');

		return opcion;
	}

}
