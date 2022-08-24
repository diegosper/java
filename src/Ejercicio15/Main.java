package Ejercicio15;

import java.util.Scanner;

public class Main {

	public static Scanner INPUT; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INPUT = new Scanner(System.in);
		int num;
		String texto;
		
		System.out.println("Ingrese un número: [finaliza con 0]");
		num = INPUT.nextInt();
		INPUT.nextLine();
		
		while (num != 0) {
		
		if (num%2 == 0) {
			texto = "El número " + num + " es par.";
		} else {
			texto = "El número " + num + " es impar";
		}
		
		System.out.println(texto);
		System.out.println("------------------------------");
		System.out.println("Ingrese un número: [finaliza con 0]");
		num = INPUT.nextInt();
		INPUT.nextLine();
		
		}
		
	}

}
