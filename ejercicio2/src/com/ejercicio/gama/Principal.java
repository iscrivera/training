package com.ejercicio.gama;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Hola Postulante");

		System.out.println("Ingresa Nombre: ");
		String nombre = myObj.nextLine(); // Read user input

		System.out.println("Ingresa tu nivel de estudios: ");
		System.out.println("1. Primaria");
		System.out.println("2. Secundaria");
		System.out.println("3. Preparatoria");
		System.out.println("4. Licenciatura");
		System.out.println("5. Postgrado");
		int estudios = Integer.parseInt(myObj.nextLine()); // Read user input

		System.out.println("Ingresa tu sexo: ");
		System.out.println("1. Mujer");
		System.out.println("2. Hombre");
		System.out.println("3. Indistinto");
		int sexo = Integer.parseInt(myObj.nextLine()); // Read user input

		System.out.println("Ingresa tu estado civil: ");
		System.out.println("1. Casado");
		System.out.println("2. Union Libre (Concubinato)");
		System.out.println("3. Soltero");
		System.out.println("4. Viudo");
		System.out.println("5. Divorciado");
		int estadoCivil = Integer.parseInt(myObj.nextLine()); // Read user input
		

		System.out.println("Ingresa tu número telefónico a 10 dígitos: ");
		long telefono = Long.parseLong(myObj.nextLine()); // Read user input
		myObj.close();
		
		Postulante postulante = new Postulante(nombre, estudios, sexo, estadoCivil, telefono);
		
		if (postulante.isCandidato()) {
			System.out.println(nombre + " tus datos serán enviados.");
		} else {
			System.out.println(nombre +" no cumples con los requisitos.");
		}
	}
}
