import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LecturaUno {
	static final String DATA_PATH = "datos.txt";
	
	public static void main(String[] args) {
	
	Scanner fileReader = null;
	try {
		// Try opening the file and set up a scanner to read it.  If the file is there,
		// the program will continue to the statement following this try block.
		fileReader = new Scanner(new File(DATA_PATH));
		//Print out a trace of the program as it is running
		System.out.println("Archivo abierto: "+fileReader);
	} catch (FileNotFoundException e) {
		// If the file is not there, an exception will be thrown and the program flow
		// will directed here.  An error message is displayed and the program stops.
		System.out.println("El archivo "+DATA_PATH+" no se encuentra!!!");
		System.out.println("El programa ha terminado.");
		System.exit(0);
	}
	
	int contador=1;
	int datoLeido=fileReader.nextInt();
	System.out.println("Numero de serie de Palas Cargadoras 78345");
	while(datoLeido==78345){
		datoLeido=fileReader.nextInt();
		System.out.println(contador+": serie: "+datoLeido);
		datoLeido=fileReader.nextInt();
		contador++;
	}
	System.out.println("Numero de serie de Palas Cargadoras 78345");
	while(datoLeido==33287){
		datoLeido=fileReader.nextInt();
		System.out.println(contador+": serie: "+datoLeido);
		datoLeido=fileReader.nextInt();
		contador++;
	}
	System.out.println("Numero de serie de RetroExacavadoras 63287");
	while(datoLeido==63287){
		datoLeido=fileReader.nextInt();
		System.out.println(contador+": serie: "+datoLeido);
		try{
		datoLeido=fileReader.nextInt();
		contador++;
		}catch(Exception e){
			
		}
	}
	
	
	}
}
