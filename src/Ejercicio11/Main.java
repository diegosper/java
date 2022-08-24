package Ejercicio11;

public class Main {

	static int numero = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (numero < 10) {
			incrementar();
			incrementar();
			incrementar();
			System.out.println(numero);
			decrementar();
			System.out.println(numero);			
		}
		
	}

	
	public static void incrementar() {
		numero++;
	}
	
	public static void decrementar() {
		numero -= 2;
	}
}
