package Ejercicio18;

public class Ejercicio18 {
	
	final static int CANT_FILAS = 10;
	final static int CANT_TRONCO = 3;
	
	public static void main(String[] args) {
		int espaciosEnBlanco = CANT_FILAS;
		System.out.printf("%" + espaciosEnBlanco +"s%n", "@");
		
		for (int i = 0; i <= CANT_FILAS; i++) {
			//System.out.printf("%" + espaciosEnBlanco +"s%n", "**");

			for (int j = 0; j <= i; j++) {
				//System.out.printf("%" + espaciosEnBlanco +"s%n", "*j");
				//espaciosEnBlanco--;
				System.out.print("**");
			}
			System.out.println("");
		}
		
		/*
		for (int i = 0; i <= CANT_FILAS; i++) {
			for (int j = i; j < CANT_FILAS; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("**");
			}
			System.out.println("");
		}
		
		for(int y = 0; y < CANT_TRONCO; y++) {
			for (int z = 0; z < CANT_FILAS-2; z++) {
				System.out.print(" ");
			}
			System.out.println("****");
		}
		*/		
	}
	
}
