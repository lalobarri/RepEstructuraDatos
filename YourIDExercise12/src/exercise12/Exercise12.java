package exercise12;
import java.util.Scanner;
 class Exercise12 {
	
	 public static void main (String [] args) {
			Scanner kb = new Scanner(System.in);
			System.out.println("Please enter data.");
			String inputLine = kb.nextLine().trim();
			while (inputLine.length() > 0) {
				System.out.println("User input: " + inputLine);
				int separator = inputLine.indexOf("±");
				String str1 = inputLine.substring(0,separator);//Valor Inicial el 0 y valor de final separator=5
				//Convertir el dato a un Double
				double valor1=Double.parseDouble(str1); //
				System.out.println("Value1: " + str1);
				String str2 = inputLine.substring(separator+1);//Valor Inicial al fin de la cadena
				double valor2=Double.parseDouble(str2);
				double upper=valor1+valor2;
				double lower=valor1-valor2;
				System.out.println("Value2: " + str2);
				System.out.println("Upper limit: " + upper);
				System.out.println("Lower limit: " + lower);
				System.out.println("Please enter data.");
				inputLine = kb.nextLine().trim();
			}
			System.out.println("The loop has ended.");
		}





}
