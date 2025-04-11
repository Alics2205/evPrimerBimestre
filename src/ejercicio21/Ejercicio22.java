package ejercicio21;

public class Ejercicio22{
	public static void main(String[] args) throws InterruptedException {
		int bateria = 100;
		int bateriabaja = 0;

		System.out.println(bateria + "%");
//100
		for (bateria = 99; bateria >= 21; bateria--) {
			System.out.println(bateria + "%");
			Thread.sleep(200);
		}
//arriba de 20 
		System.out.println("bateria baja.");
//abajo de 21
		for (bateriabaja = 20; bateriabaja > 0; bateriabaja--) {
			System.out.println(bateriabaja + "%");
			Thread.sleep(100);
		}
//0
		System.out.println("bateria agotada");
	}
}
