package quick;

public class Quick {
	
	public static void ordenaQuick(int vect[],int izq,int der){
	 	int i=0,j=0;
		int x=0,aux=0;
		
		i=izq;
		j=der;
		x=vect[(izq+der)/2];//pivote
		do{
			while((vect[i]<x) && (j<=der)){
				i++;}
			while((x<vect[j]) && (j>izq)){
				j--;}
			if(i<=j){
				aux=vect[i];
				vect[i]=vect[j];
				vect[j]=aux;
				i++;	j--;
			}
		}while(i<=j);
		if(izq < j)
			ordenaQuick(vect,izq,j);
		if(i < der)
			ordenaQuick(vect,i,der);	
	}
	
	
	
	public static void quicksort(int A[], int izq, int der) {

		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la b�squeda de izquierda a derecha
		  int j=der; // j realiza la b�squeda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las b�squedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		}
	
	public static void main(String[] args) {
		int arreglo[]={10,80,50,95,70,5,95,17,87,65};
		ordenaQuick(arreglo, 0, arreglo.length-1);
		for(int i=0;i<arreglo.length;i++){
			System.out.print(arreglo[i]+",");
		}
	}


}
