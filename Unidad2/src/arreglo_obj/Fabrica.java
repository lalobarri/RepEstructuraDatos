package arreglo_obj;

import java.util.Scanner;

public class Fabrica {
	public static void main(String[] args) {/*
		//Inicializar arreglo
		Persona[] grupo={new Persona("Juan Mtz",26,5000),
				new Persona("José Pavón",26,5800),
				new Persona("María García",27,10000)};*/
		Scanner lector=new Scanner(System.in);
		Persona[] grupo=new Persona[3];
		for (int i=0; i<grupo.length;i++) {
			grupo[i]=new Persona();
			System.out.println("Nombre:");
			grupo[i].setNombre(lector.next());
			System.out.println("Edad:");
			grupo[i].setEdad(lector.nextInt());
			System.out.println("Sueldo:");
			grupo[i].setSueldo(lector.nextDouble());
			
		}
		//imprimir con for each
		for (Persona persona : grupo) {
			System.out.println(persona.toString());
			
		}
		
		
	}
	

}
