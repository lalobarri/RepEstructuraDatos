package intro_arreglos;

/* Realizar una busqueda secuencial
   en un arreglo de enteros, buscar un 
   numero entera dado*/
public class Ejercicio02 {
	// Método para busqueda
	public static int buscaDato(int arre[], int busca) {
		int pos = -1;
		for (int i = 0; i < arre.length; i++) {
			if (busca == arre[i])
				pos = i;
		}
		return pos;
	}

	public static int[] ordenaArreglo(int arre[]) {
		int aux;
		for (int j = 0; j < (arre.length - 1); j++) {
			for (int i = 0; i < (arre.length - 1); i++) {
				if (arre[i] > arre[i + 1]) {
					// cambio
					aux = arre[i];
					arre[i] = arre[i + 1];
					arre[i + 1] = aux;
				} // if
			} //for i
		} // for j
		return arre;
	}

	public static String imprimeArreglo(int arre[]) {
		String cadena = "";
		for (int i = 0; i < arre.length; i++) {
			cadena = cadena + arre[i] + ",";
		}
		return cadena;
	}

	public static void main(String[] args) {
		int arreglo[] = { 10, 9, 8, 5, 1, 0, -9, 5 }; // Declarando y definiendo
		System.out.println("Arreglo Original:" + imprimeArreglo(arreglo));
		System.out.println("Areglo Ordenando");
		System.out.println(imprimeArreglo(ordenaArreglo(arreglo)));

		/*
		 * int numeroBuscar=5; int pos=buscaDato(arreglo, numeroBuscar);
		 * 
		 * if( pos==-1){ System.out.println("No se encontro el dato"); }else{
		 * System.out.println("El dato se encontro en..."+pos); }
		 */
	}

}
