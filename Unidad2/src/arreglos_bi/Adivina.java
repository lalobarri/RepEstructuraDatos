package arreglos_bi;

public class Adivina {
	private String[][] adivinanzas;
	
	public String[][] defineArreglo(){
		String[][] muestra={{"Agrio su sabor, bastande dura su piel",
			                 "Tiene ojos y no ve,  tiene corona y no es rey",
			                 "El la cara tengo dos y si los cierro no veo que son",
			                 "Tengo nombre de animal, "
			                 + "y cuando una llanta se pincha me tiene que utilizar",
			                 "Tela digo y no me entiendes, tela repito y no me comprendes"},
				
				
				
				
				{"LIMON","PIÑA","OJOS","GATO","TELA"}};
		adivinanzas=muestra;
		return muestra;
	}
	
	public boolean comparaRespuesta(int ren, int col, 
			String respuesta){
		return respuesta.equals(adivinanzas[ren+1][col]);
	}
	
	public String mostrarAdivinaza(int ren, int col){
		return adivinanzas[ren][col];
	}
	
	public String mostrarRespuesta(int ren, int col){
		return adivinanzas[ren+1][col];
	}
	
	
	//Generar un numero aletarios
	/*public int licgeneraEntero(){
		int tam=adivinanzas[0].length;
		
	}*/
	
	

}
