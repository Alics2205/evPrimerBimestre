package Cantera;

import java.util.Scanner;

public class ejerc13 {
	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese la hora: ");
		int hora = ingreso.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		int min = ingreso.nextInt();
		
		System.out.println("Ingrese los segundos: ");
		int seg = ingreso.nextInt();

	if (hora>24 && hora<0) {
		System.out.println(" el valor es incorrecto ");
	}
	
	if (min>60 && min<0) {
		System.out.println(" el valor es incorrecto ");
	}
	
	if (seg>60 && seg<0) {
		System.out.println(" el valor es incorrecto ");
	}

	if (hora<=24 && hora>0) {
		System.out.println(" el valor es correcto ");
	}
	
	if (min<=60 && min>0) {
		System.out.println(" el valor es correcto ");
	}
	
	if (seg<=60 && seg>0) {
		System.out.println(" el valor es correcto ");
	}
	
	
	
	
	
	
	}

}
