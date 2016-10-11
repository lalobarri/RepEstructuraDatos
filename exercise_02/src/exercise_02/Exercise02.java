package exercise_02;
import java.util.Scanner;//lectura de datos

public class Exercise02 {
	public static void main(String[] args) {
		//Cadena
		String nombre;
		int edad;
		Scanner objLector = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		nombre=objLector.next();
		System.out.println("Cual es tu edad?");
		edad=objLector.nextInt();
		System.out.println("Hola como estas? "+nombre);
		System.out.println("Tienes " + edad+"de edad");	
		
		//Hacer las modificaciones necesarias para que sea un 
		//programa orientado a objetos
	}
	

}
