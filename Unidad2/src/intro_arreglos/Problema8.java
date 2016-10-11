package intro_arreglos;

public class Problema8 {
	static int[] datos={8,25,7,9,6};
	int i=0;
	static int mayor=datos[0];
	
	public void encuentraMayor(int arreglo[]){
		if (i<datos.length){
			if(arreglo[i]>mayor){
				mayor=arreglo[i];
			}
			i++;
			encuentraMayor(arreglo);
		}
	}
	
	public static void main(String[] args) {
		
		Problema8 obj=new Problema8();
		obj.encuentraMayor(datos);
		System.out.println("El mayor es: " + mayor);
	}

}
