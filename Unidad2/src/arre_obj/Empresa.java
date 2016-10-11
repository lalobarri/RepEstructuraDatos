package arre_obj;

import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		
		//Declarar e inicializar un arreglo de objetos
		Empleado[] arreglo= new Empleado[3];
		
		Empleado[] grupo={new Empleado("Juan", 18, 3500),
				new Empleado("Miguel",25,5000),
				new Empleado("Miriam",33,7000),
				new Empleado("Martha",25,8500)};
		
		System.out.println("Tamaño de arreglo="+arreglo.length);
		System.out.println("Tamaño de grupo="+grupo.length);
		System.out.println("Datos del grupo");
		for (Empleado empleado : grupo) {
			System.out.println(empleado.toString());
		}
		//pedir los datos
		Scanner lector=new Scanner(System.in);
		
		for (int i=0;i<arreglo.length;i++){
			arreglo[i] = new Empleado();//Tener cuidado con este
			System.out.println("Empleado "+i+" Nombre: ");
			arreglo[i].setNombre(lector.next());
			System.out.println("Edad: ");
			arreglo[i].setEdad(lector.nextInt());
			System.out.println("Sueldo: ");
			arreglo[i].setSueldo(lector.nextDouble());
			//System.out.println(arreglo[i].toString());
		}
		for (Empleado empleado : arreglo) {
			System.out.println(empleado.toString());
		}
		
	}

}
