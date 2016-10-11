package exercise_02;
import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		System.out.println("Nombre?");	
		String nombre=lector.next();
		System.out.println("Edad?");
		int edad=lector.nextInt();
		
		Persona perUno=new Persona();
		perUno.setNombre(nombre);
		perUno.setEdad(edad);
		perUno.mostrarSaludo();
		

	}

}
