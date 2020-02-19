package mx.ejercicio.gama;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Hola nuevo mexicano");

		System.out.println("Ingresa Nombre: ");
		String nombre = myObj.nextLine(); // Read user input

		System.out.println("Ingresa Primer Apellido: ");
		String primerApellido = myObj.nextLine(); // Read user input

		System.out.println("Ingresa Segundo Apellido: ");
		String segundoApellido = myObj.nextLine(); // Read user input

		System.out.println("Ingresa Fecha de Nacimiento (dd/mm/aaaa): ");
		String fechaNac = myObj.nextLine(); // Read user input

		System.out.println("Ingresa Lugar de Nacimiento: ");
		String lugarNacimiento = myObj.nextLine(); // Read user input

		System.out.println("Ingresa CURP: ");
		String curp = myObj.nextLine(); // Read user input
		myObj.close();
		
		Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNac);

		ActaDeNacimiento acta = new ActaDeNacimiento(primerApellido, segundoApellido, nombre, fechaNacimiento,
				lugarNacimiento, curp);
		System.out.println(acta.toString());
		if (acta.isAdulto() == true) {
			System.out.println("Eres un adulto mexicano, puedes votar");
		} else {
			System.out.println("Eres un niño mexicano, No puedes votar");
		}
	}

}
