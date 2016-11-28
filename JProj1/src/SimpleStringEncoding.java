import java.util.Scanner;

public class SimpleStringEncoding {

	private static Scanner input;

	public static void main(String[] args) {
		String s;
		String result = "";
		
		input = new Scanner(System.in);
		System.out.println("\nPlease enter a String: ");
		s = input.nextLine();
		
		result += Character.toString((char)(s.charAt(0)-1));
		result += Character.toString((char)(s.charAt(1)-1));
		result += Character.toString((char)(s.charAt(2)-1));
		result += Character.toString((char)(s.charAt(3)-1));
		result += Character.toString((char)(s.charAt(4)-1));
		
		System.out.printf("The Encode string is: %s", result);
		
	}

}
