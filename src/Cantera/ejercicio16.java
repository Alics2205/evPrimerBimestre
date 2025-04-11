package Cantera;

import java.util.Scanner;

public class ejercicio16 {
	
	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
     System.out.println("menu: "
		+ "\r\n• 1 es café cortado,\r\n"
		+ "• 2 es café Latte,\r\n"
		+ "• 3 es café solo,\r\n"
		+ "• 4 es café lágrima.\r\n"
		+ "• La opción 5, es para salir del programa. ");
 	  int opcion  = ingreso.nextInt();
 	  
 	 switch(opcion) {
 	 
 	
	case 1 : System.out.println("cafe cortado ");
	break;
	
	
	case 2 : System.out.println("café latte");
	break;
	
	
	case 3 : System.out.println("café solo");
	break;
	
	case 4 : System.out.println(" café lagrima");
	break;
	
	default: System.err.println("Elegiste cualquier cosa");
	break;
 	 
 	 
 	 }
 	 
 	
	}

}
