package exercise11;

public class StringMet {
	public static void main(String[] args) {
		String strng="this is the data you are supposed to use";
		System.out.println(strng.indexOf("you"));
		System.out.println(strng.indexOf("are", 18));
		
		System.out.println("<" + strng.substring(30) + ">");
	}

}
