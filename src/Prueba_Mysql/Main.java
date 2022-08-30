package Prueba_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/?user=root";
		final String user = "root";
		final String pass = "esplai22";

		try {
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Successful connection");
		
					
			connection.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error en la conexión de la BBDD");
			
		}
	}

}
