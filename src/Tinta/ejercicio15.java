package Tinta;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
    System.out.println("ingrese talle de remera S/M/L: ");
	
	char opcSalir = datos.next().charAt(0);
	
	switch(opcSalir) {
	case 's': 
	case 'S': System.out.println(" Solo quedan 5 remeras.");
	break;
	
	case 'm': 
	case 'M': System.out.println("Solo quedan 2 remeras.");
	break;
	
	case 'l': 
	case 'L': System.out.println("No hay stock.");
	break;
	
	default: System.err.println("Elegiste cualquier cosa");
	break;
	}

	System.out.println("Hasta la proxima");

}
}
