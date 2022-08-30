package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
	
	final static char ESPACIO_BLANCO = ' ';
	final static String ESTRELLAS = "**";
	static Scanner INPUT;
	
	
	public static void main(String[] args) {

		/* 
		 * VERSION 2 DIEGO
		 */
		
		INPUT = new Scanner (System.in);
		System.out.print("¿De cuántas filas quiere el árbol navideño? " );
		int cantFilasArbol = INPUT.nextInt();
		System.out.print("¿De cuántas filas quiere el tronco del árbol? ");
		int cantFilasTronco = INPUT.nextInt();
		
		armarArbol(cantFilasArbol);
		armarTronco(cantFilasTronco, cantFilasArbol);
		
	}
		
	
	
	
	private static void armarArbol(int cantFilasArbol) {
		for (int i = cantFilasArbol; i >= 1; i--) {
			System.out.print(" ");
			generarEspacios(i);
			generarEstrellas(cantFilasArbol, i);
			generarEspacios(i);
			System.out.println("");
		}
	}
		
	private static void generarEspacios (int numeroDeFila) {
		System.out.printf("%" + numeroDeFila + "s", ESPACIO_BLANCO);
	}
	
	private static void generarEstrellas (int cantFilasArbol, int numeroDeFila) {
		for (int j = 0; j <= (cantFilasArbol - numeroDeFila); j++){
			System.out.print(ESTRELLAS);
		}
	}
	
	private static void armarTronco (int cantFilasTronco, int cantFilasArbol) {
		for (int i = cantFilasTronco; i >= 1; i--) {
			System.out.print(" ");
			generarEspacios(cantFilasArbol - ESTRELLAS.length());
			generarEstrellas(ESTRELLAS.length(), 0);
			generarEspacios(cantFilasArbol - ESTRELLAS.length()); 
			System.out.println("");
		}
	}
		
		
		

/*
 * VERSION 1 DIEGO
 */
		
//		for (int i = 0; i <= CANT_FILAS; i++) {
//			imprimirEspacioEnBlanco(i);
//			imprimirAsteriscos(i);
//			imprimirEspacioEnBlanco(i);
//			System.out.println("");
//		}
//		
//		for(int y = 0; y < CANT_TRONCO; y++) {
//			for (int z = 0; z < CANT_FILAS-2; z++) {
//				System.out.print(" ");
//			}
//			System.out.print("****");
//			for (int z = 0; z < CANT_FILAS-2; z++) {
//				System.out.print(" ");
//			}
//			System.out.println("");
//			
//		}
//				
//	}
//	
//	public static void imprimirEspacioEnBlanco(int numRepeticion) {
//		for (int j = numRepeticion; j < CANT_FILAS; j++) {
//			System.out.print(" ");
//		}
//	}
//	
//	public static void imprimirAsteriscos (int numRepeticion) {
//		for (int j = 0; j < numRepeticion; j++) {
//			System.out.print("**");
//		}
//	}
//	
	

		/*
		 * VERSION DAVID
		 */
//		public static void main(String[] args) {
//			spacing(5, 2);
//			// copaArbol();
//		}
	
	/*VERSION DAVID
	  	public static String spacing(int spaces, int stars) {
		char caracter = ' ';
		System.out.printf("%" + spaces + "s", caracter);
		System.out.print(stars(stars));
		System.out.printf("%" + spaces + "s\n", caracter);
		return "";
	}

	public static String stars(int stars) {
		String estrellitas = "";
		for (int i = 0; i < stars; i++) {
			estrellitas += "\033[0;42m*\033[0m";
		}
		return estrellitas;
	}

	public static void copaArbol() {

		int espacio = 30;
		int estrellas = 1;
		for (int i = 0; i < 10; i++) {
			spacing(espacio, estrellas);
			espacio = espacio - 1;
			estrellas = estrellas + 2;
		}for (int i = 0; i < 4; i++) {
			spacing(29,3);
		}
	}
	 
	 */
	
}
