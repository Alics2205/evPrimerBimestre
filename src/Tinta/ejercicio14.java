package Tinta;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int edad = ingreso.nextInt();

		System.out.println("¿pago la entrada? (true/false): ");
		boolean pagoEntrada = ingreso.nextBoolean();

		if (edad >= 18) {
			
			if (pagoEntrada) {
				System.out.println(" entrada valida ");
			} else {
				System.out.println(" entrada no valida ");

			}
			
		} else {
			System.out.println("entrada no permitida ");
		}

	}
}