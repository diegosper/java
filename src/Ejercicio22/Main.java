package Ejercicio22;

public class Main {

	final static int COLUMNAS = 40;
	final static int FILAS = 6;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		final String FUENTE_COLOR_81 = "\033[38;5;81m";
		
		final String BACKGROUND_COLOR_12 = "\033[48;5;12m";
		final String BACKGROUND_COLOR_226 = "\033[48;5;226m";
		final String BACKGROUND_COLOR_0 = "\033[48;5;0m";
		final String BACKGROUND_COLOR_9 = "\033[48;5;9m";
		final String BACKGROUND_COLOR_1 = "\033[48;5;1m";


		System.out.println("****************************************");

		// BANDERA DE UCRANIA

		System.out.println("Bandera de Ucrania \n");
		completarColor(BACKGROUND_COLOR_12, FILAS, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, FILAS, COLUMNAS);
		
		System.out.println("\n****************************************");

		// BANDERA DE CATALUNYA

		System.out.println("Bandera de Catalunya \n");
		completarColor(BACKGROUND_COLOR_226, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_1, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_1, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_1, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_1, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_1, 1, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, 1, COLUMNAS);
		
		
		
		System.out.println("\n****************************************");
		
		
		// BANDERA DE ALEMANIA

		System.out.println("Bandera de Alemania \n");
		completarColor(BACKGROUND_COLOR_1, 4, COLUMNAS);
		completarColor(BACKGROUND_COLOR_226, 4, COLUMNAS);
		completarColor(BACKGROUND_COLOR_0, 4, COLUMNAS);
		System.out.println("\n****************************************");
		
		
	}
	
	public static void completarColor(String color, int cantFilas, int cantColumnas) {
		final String ANSI_FINAL = "\033[0m";

		for (int i = 0; i < cantFilas; i++) {
			System.out.printf("%s%" + cantColumnas + "s%s%n", color, " ",  ANSI_FINAL);
		}
		
	}

}
