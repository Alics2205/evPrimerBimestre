package Tinta;

public class Ejercicio21 {
	public static void main(String[] args) throws InterruptedException {

		int bateria = 100;

		System.out.println(bateria + "%");

		while (bateria >= 0) {
			System.out.println("la bateria es: " + bateria + "%");
			Thread.sleep(200);

			if (bateria == 20)
			{
				System.out.println("bateria baja");
				Thread.sleep(1000);
			}
			if (bateria == 0)
			{
				System.out.println("bateria agotada");

			}
			bateria--;
		}
	}
}