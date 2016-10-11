package intro_arreglos;
import java.util.Scanner;

public class Matriz {
	public static int[][] pedirDatos(int mat[][]){
		Scanner lector=new Scanner(System.in);
		for(int fila=0;fila<mat.length;fila++){
			for(int col=0; col<mat[fila].length;col++){
				System.out.print("Escribe el dato fila["+fila);
				System.out.println("],col["+col+"] -->");
				mat[fila][col]=lector.nextInt();
			}
		}
		return mat;
	}
	
	public static String mostrarDatos(int mat[][]){
		String result="";
		
		for(int fila=0;fila<mat.length;fila++){
			int suma=0;
			for(int col=0; col<mat[fila].length;col++){
				result=result+mat[fila][col]+", ";
				suma=suma+mat[fila][col];
			}
			result=result+" = "+suma+"\n";
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		int[][] mat={{5,2,3},{8,6,7},{4,9,9,8,9}}; //dos filas y  tres columnas
		//pedirDatos(mat);
		System.out.println(mostrarDatos(mat));
		
	}

}
