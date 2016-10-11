package arreglos_bi;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JuegaAdivina {
	public static void main(String[] args) {
		Adivina  adiv=new Adivina();
		adiv.defineArreglo();//Se definen los datos del arreglo
		//mostrar el arreglo
		Scanner lector = new Scanner(System.in);
		for(int i=0;i<5;i++){
			JOptionPane.showInputDialog(adiv.mostrarAdivinaza(0, i)+"¿Qué es...?");
			//System.out.println("¿Qué es...?");
			String respuesta=lector.next();
			if(adiv.comparaRespuesta(0, i, respuesta)){
				System.out.println("Es correcato, Felicidades!!! :)");
			}else{
				System.out.println("Lo siento !!!  :(");
			}
		}
		
	}
	

}
