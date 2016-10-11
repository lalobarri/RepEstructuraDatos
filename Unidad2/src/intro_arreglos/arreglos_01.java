package intro_arreglos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arreglos_01 {
	String alumnos[];
	float calif[];
	Scanner fileReader = null;
	int tam;

	public void definirArreglo() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Cuantos alumnos son en el grupo?");
		tam = lector.nextInt();
		alumnos = new String[tam];
		calif = new float[tam];

	}

	public void leerDatos() {
		
		try {
			fileReader = new Scanner(new File("datos.txt"));
			System.out.println("Archivo Abierto: datos.txt");

		} catch (FileNotFoundException e) {
			System.out.println("El archivo  No se encuentra!!!");
			System.out.println("Programa Terminado");
			System.exit(0);
		}
		int tam=fileReader.nextInt();
		alumnos = new String[tam];
		calif = new float[tam];
	}
	
	//Cargando el arreglo
	public void recorreArreglo(){
		for(int i=0;i<alumnos.length;i++){
			alumnos[i]=fileReader.next();
			calif[i]=fileReader.nextInt();
		}
	}
	public void imprimeArreglo(){
		System.out.println("Alumnos en la lista: "+alumnos.length);
		for(int i=0;i<alumnos.length;i++){
			System.out.print(alumnos[i]+"-->");;
			System.out.println(calif[i]);;
		}
	}
	
	public static void main(String[] args) {
		arreglos_01 a=new arreglos_01();
		a.leerDatos();
		a.recorreArreglo();
		a.imprimeArreglo();
	}
	
	//Los que pasaron...
	//Los que reprobaron...
	

}
