package Ejercicio24;

import java.util.Scanner;

public class Main {

	final static char ESPACIO_BLANCO = ' ';
	final static String ESTRELLAS = "**";
	final static Scanner INPUT = new Scanner (System.in);
	final static String BACKGROUND_COLOR_NEGRO = "\033[48;5;16m";
	final static String BACKGROUND_COLOR_VERDE = "\033[48;5;2m";
	final static String FONT_COLOR_NEGRO = "\033[38;5;16m";
	final static String ANSI_FINAL = "\033[0m";
	
	
	public static void main(String[] args) {
		
		
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
			generarEstrellas(cantFilasArbol, i, BACKGROUND_COLOR_VERDE, FONT_COLOR_NEGRO);
			generarEspacios(i);
			System.out.println("");
		}
	}
		
	private static void generarEspacios (int numeroDeFila) {
		System.out.printf("%" + numeroDeFila + "s", ESPACIO_BLANCO);
	}
	
	private static void generarEstrellas (int cantFilasArbol, int numeroDeFila, String colorFondo, String colorLetra) {
		for (int j = 0; j <= (cantFilasArbol - numeroDeFila); j++){
			System.out.print(colorFondo + colorLetra + ESTRELLAS + ANSI_FINAL + ANSI_FINAL);
		}
	}
	
	private static void armarTronco (int cantFilasTronco, int cantFilasArbol) {
		for (int i = cantFilasTronco; i >= 1; i--) {
			System.out.print(" ");
			generarEspacios(cantFilasArbol - ESTRELLAS.length());
			generarEstrellas(ESTRELLAS.length(), 0, BACKGROUND_COLOR_NEGRO, FONT_COLOR_NEGRO);
			generarEspacios(cantFilasArbol - ESTRELLAS.length()); 
			System.out.println("");
		}
	}

}
