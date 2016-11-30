import java.util.Scanner;

public class StringOperations {
	private String str1, str2;
	private Scanner input;
	
	public void stringOperationsExplained()
	{
		input = new Scanner(System.in);
		System.out.print("Enter the string1: ");
		str1 = input.nextLine();
		System.out.print("Enter the string2: ");
		str2 = input.nextLine();
		
		//String concatenation
		System.out.printf("Combined string is: %s\n", str1.concat(str2));
		
		//String upper case conversion
		System.out.printf("Converted string is: %s\n", str1.toUpperCase());
		
		//String lower case conversion
		System.out.printf("Converted string is: %s\n", str1.toLowerCase());
		
		//Print the 5th character in the String 
		System.out.printf("5th char of the string is: %s\n", str1.charAt(4));
		
		//Find the 10th character of the String 
		System.out.printf("10th char of the string is: %s\n", str1.indexOf('r', 10));
		
		//Find the substring starts from 5th character
		System.out.printf("Substring from 5th char is: %s\n", str1.substring(4));
		
		//Find the substring starts from 5th character and ends in 10th character
		System.out.printf("Substring from 5th to 10th char is: %s\n", str1.substring(4, 11));
		
		//Replace a character in a string
		System.out.printf("Replaced characters in the string is: %s\n", str1.replace('r', 'p'));
		
		//Replace sub string in a string
		System.out.printf("Replaced string is: %s\n", str1.replace("Rajesh", "Pragya"));
		
		//trim a string
		System.out.printf("trimmed string is: %s\n", str1.trim());
				
		//Compare 2 strings
		if(str1==str2){
		System.out.printf("Same input");
		}
		else System.out.println("Different inputs");		
	}
}
