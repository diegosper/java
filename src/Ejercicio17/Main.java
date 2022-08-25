package Ejercicio17;

import java.util.Scanner;

public class Main {

	public static Scanner INPUT;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean error;
		String texto = "";
		INPUT = new Scanner(System.in);

		do {

			System.out.println("Ingrese un número: [finaliza con 0]");
			num = INPUT.nextInt();
			INPUT.nextLine();
			error = (num < 0 || num > 9);
			if (error) {
				System.out.println("Valor ingresado fuera de rango\n");
			}

		} while (error);

		while (num != 0) {

			switch (num) {
			case 1:
				texto = "Uno";

				break;
			case 2:
				texto = "Dos";
				break;
			case 3:
				texto = "Tres";
				break;
			case 4:
				texto = "Cuatro";
				break;
			case 5:
				texto = "Cinco";
				break;
			case 6:
				texto = "Seis";
				break;
			case 7:
				texto = "Siete";
				break;
			case 8:
				texto = "Ocho";
				break;
			case 9:
				texto = "Nueve";
				break;
			}
			System.out.println(texto);
			System.out.println("------------------------------");

			do {
				System.out.println("Ingrese un número: [finaliza con 0]");
				num = INPUT.nextInt();
				INPUT.nextLine();
				error = (num < 0 || num > 9);
				if (error) {
					System.out.println("Valor ingresado fuera de rango");
				}
			} while (error);

		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Siguiente ejercicio: realizar un 'if' en un operador ternario");
		System.out.println("");
		
		double number = 0;
		String resultado = "";

		resultado = (number > 0) ? "¡Es positivo!" : (number < 0) ? "¡Es negativo!" : "¡Ostras! Es cero, na de ná...";
		System.out.println(resultado);

	}

}
