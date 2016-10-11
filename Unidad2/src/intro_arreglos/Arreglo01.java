package intro_arreglos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arreglo01 {
	String alumnos[]; //Declaración del arreglo
	float calif[];
	Scanner fileReader = null;
	int tam;  //Para el tamaño del arreglo
	
	
	
	public void definirArreglo(){
		try {
			fileReader = new Scanner(new File("lista.txt"));
			System.out.println("Archivo Abierto: lista.txt");

		} catch (FileNotFoundException e) {
			System.out.println("El archivo  No se encuentra!!!");
			System.out.println("Programa Terminado");
			System.exit(0);
		}
		int tam=fileReader.nextInt();
		alumnos = new String[tam];
		calif = new float[tam];
		
	}
	
	public void definirArreglo2(){
		System.out.println("Cuanto alumnos hay???");
		Scanner lector=new Scanner(System.in);
		int tam=lector.nextInt();
		alumnos = new String[tam];
		calif = new float[tam];	
		for (int i=0;i<alumnos.length;i++){
			System.out.println("Cual es el nombre: ");
			alumnos[i]=lector.next();
			System.out.println("Cual es la calif: ");
			calif[i]=lector.nextFloat();
		}
		
		
	}
	public void recorreArreglo(){
		for (int i=0;i<alumnos.length;i++){
			alumnos[i]=fileReader.next();
			calif[i]=fileReader.nextFloat();
		}
	}
	
	public void imprimeDatos(){
		System.out.println("Alumnos: "+alumnos.length);
		for (int i=0;i<alumnos.length;i++){
			System.out.print(alumnos[i] + " --> ");
			System.out.println(calif[i]);
		}
	}
	
	//Método que muestre los alumnos aprobados (>8)
	public void imprimeAprobados(){
		System.out.println("Alumnos Aprobados:");
		for(int i=0; i<alumnos.length;i++){
			if (calif[i]>=8){
				System.out.println(alumnos[i]);
			}
		}
	}
	
	//Método que muestre los alumnos reprobados (<8)
	public void imprimeReprobados(){
		System.out.println("Alumnos Reprobados: ");
		for(int i=0; i<alumnos.length;i++){
			if (calif[i]<8){
				System.out.println(alumnos[i]);
			}
		}
	}
	public void defineMayor(){
		float mayor=calif[0];
		int elementoMayor=0;
		for(int i=0; i<calif.length;i++){
			if (calif[i]>mayor){
				mayor=calif[i];
				elementoMayor=i;
			}
		}
		System.out.println("Quien sacó mayor calificación fue:");
		System.out.print(alumnos[elementoMayor]+" con calificación");
		System.out.print(" de " + calif[elementoMayor]);
	}
	public static void main(String[] args) {
		Arreglo01 obj = new Arreglo01();
		obj.definirArreglo();
		obj.recorreArreglo();
		obj.imprimeDatos();
		obj.imprimeAprobados();
		obj.imprimeReprobados();
		obj.defineMayor();
	}
	

}
