package exercise11;
import java.util.Scanner;
public class StringMan {
	public static void main(String[] args) {
		/*System.out.println("Enter the values separated by blanks");
		Scanner keyboard = new Scanner(System.in);
		int result = 0;
		int cntr = 0;
		result += keyboard.nextInt();
		cntr++;
		System.out.println(cntr + ": " + result);
		result += keyboard.nextInt();
		cntr++;
		System.out.println(cntr + ": " + result);
		result += keyboard.nextInt();
		cntr++;
		System.out.println(cntr + ": " + result);*/
		System.out.println("Enter the values on separate lines.");
		Scanner keyboard = new Scanner(System.in);
		int result = 0;
		int cntr = 0;
		String line = keyboard.nextLine();
		Scanner lineScnr = new Scanner(line);
		result += lineScnr.nextInt();
		cntr++;
		System.out.println(cntr + ": " + result);
		line = keyboard.nextLine();
		lineScnr = new Scanner(line);
		result += lineScnr.nextInt();
		cntr++;
		System.out.println(cntr + ": " + result);
		line = keyboard.nextLine();
		lineScnr = new Scanner(line);
		result += lineScnr.nextInt();
		cntr++;
		System.out.println(cntr + ": " + result);


	}

}
