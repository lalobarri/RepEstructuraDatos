package burbuja;

import java.util.Scanner;

public class Burbuja {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Scanner lector2 = new Scanner(System.in);
		int tam;
		System.out.println("Ingesa el tamaño del arreglo");
		tam = lector.nextInt();
		String[] arreglo = new String[tam];
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Ingresa el texto [" + i + "]:");
			arreglo[i] = lector2.nextLine();
		}

		// Imprimir el arreglo desordenado
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("arreglo [" + i + "]:" + arreglo[i]);
		}
		System.out.println("Arreglo ordenado");
		String aux;
		for (int i = 1; i <= arreglo.length; i++) {
			for (int j = 0; j < arreglo.length - i; j++) {
				if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}
				
			}
		}
		

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("arreglo [" + i + "]:" + arreglo[i]);
		}

	}
}
