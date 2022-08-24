package Ejercicio13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1, 
			num2 = 2,
			num3 = 3,
			num4 = 2;
		boolean comprobacion;
		
		System.out.println("num1 = " + num1 +"\n" +
							"num2 = " + num2 +"\n" +
							"num3 = " + num3 +"\n" +
							"num4 = " + num4 +"\n" +
							"--------------------");
		
		comprobacion = num4 == num2;
		System.out.println("num4 = num2??? " + comprobacion);
		
		comprobacion = num2 == num3;
		System.out.println("num2 = num3??? " + comprobacion);
		
		comprobacion = num1 != num3;
		System.out.println("num1 != num3??? " + comprobacion);
		
		comprobacion = num2 != num2;
		System.out.println("num2 != num2??? " + comprobacion);
		
		comprobacion = num4 < num3;
		System.out.println("num4 < num3??? " + comprobacion);

		comprobacion = num3 < num1;
		System.out.println("num3 < num1??? " + comprobacion);
		
		comprobacion = num1 > num3;
		System.out.println("num4 = num2??? " + comprobacion);
		
		comprobacion = num2 > num4;
		System.out.println("num2 = num4??? " + comprobacion);
	
		comprobacion = num2 > num3;
		System.out.println("num2 > num3??? " + comprobacion);
	
		comprobacion = num2 <= num3;
		System.out.println("num2 <= num3??? " + comprobacion);
	
		comprobacion = num2 <= num4;
		System.out.println("num2 <= num4??? " + comprobacion);
	
		comprobacion = num2 <= num1;
		System.out.println("num2 <= num1??? " + comprobacion);
	
		comprobacion = num1 >= num2;
		System.out.println("num1 >= num2??? " + comprobacion);
	
		comprobacion = num2 >= num1;
		System.out.println("num2 >= num1??? " + comprobacion);
		
		comprobacion = num2 >= num2;
		System.out.println("num2 >= num2??? " + comprobacion);
	
	
	}
	
	

}
