import org.omg.CORBA.CurrentHolder;

public class Ejercicio_04 {
	
	static int factorial(int numero) {
		if (numero <= 1) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}
	
	//método para contar de 1..N
	static int inicial=1;
	static void cuentaHasta(int n){
		if(inicial<=n){
			System.out.println(inicial);
			inicial++;
			cuentaHasta(n);
		}
	}
	//metodo para una cuenta regresiva a partir de N a 0
	static void regresa(int n){
		if(n>=0){
			System.out.println(n);
			n--;
			regresa(n);
		}
	}
	/*
	 * UTNG - SISTEMAS INFORMÁTICA
	 * AUTOR: JOSÉ JUAN RODRÍGUEZ  NO. 19223232
	 * OBJETIBO DEL PROGRAMA: MÉTODOS DE RECURSIVIDAD 
	 *
	 */

	public static void main(String args[]) {
		//System.out.println(factorial(4));
		//cuentaHasta(5);
		regresa(8);
	}

}
