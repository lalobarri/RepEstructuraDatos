
package Singleton;

public class UT {
	
	
	private static UT instance;
	private String nombreUT;
	
	private UT (String nombreUT){
		this.nombreUT=nombreUT;
	}
	
	public static UT getInstance(String nombre){
	
	if (instance==null){
		 instance = new UT(nombre);
		 System.out.println("Se ha creado una nueva Instancia " );
		 
	 }else{
		 System.out.println("Ya existe una instancia, por tanto no se pude crear otra");
	 }
	
	return (instance);
	
	}
		
	
}
