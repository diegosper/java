package Ejercicio09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, apellido, calle, municipio, codigoPostal, correoElectronico;
		char sexo;
		
		nombre = "Diego";
		apellido = "Sperber";
		calle = "Rambla";
		municipio = "Sabadell";
		codigoPostal = "08201";
		correoElectronico = "diego@hotmail.com";
		sexo = 'M';
		
		System.out.println("Nombre completo: " + nombre + " " + apellido +
							"\t\t" + "sexo: " + sexo + "\n" + 
							"Domicilio: " + calle + ", " + codigoPostal + " " + municipio + "\n" + 
							"Correo electrónico: " + correoElectronico);
	
	}

}
