package Ejercicio16;

import javax.swing.tree.VariableHeightLayoutCache;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double decimales = Math.pow(10, 2);
		double temperaturaRandom = Math.round(Math.random()*40*decimales)/decimales;
		String categoriaDelClima;
		String tipoDeClima;
		
		System.out.println("TEMPERATURA: " + temperaturaRandom + "ºC");
		
		if (temperaturaRandom < 10) {
			categoriaDelClima = "Climas frios";
			if (temperaturaRandom >= 5) {
				tipoDeClima = "Alta montaña";
			} else {
				tipoDeClima = "Polar";
			}
		} else if (temperaturaRandom < 20){
			categoriaDelClima = "Climas templados";
			if (temperaturaRandom >= 16.5) {
				tipoDeClima = "Continental";
			} else if (temperaturaRandom >= 13.5) {
				tipoDeClima = "Mediterráneo";
			} else {
				tipoDeClima = "Oceánico";
			}
		} else {
			categoriaDelClima = "Climas cálidos";
			if (temperaturaRandom >= 26.5) {
				tipoDeClima = "Desértico";
			} else if (temperaturaRandom >= 23.5) {
				tipoDeClima = "Tropical";
			} else {
				tipoDeClima = "Ecuatorial";
			}
		}
		
		System.out.println(categoriaDelClima);
		System.out.println("Tipo " + tipoDeClima);
	}

}
