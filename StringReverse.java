package ImportantJavaPrograms;
import java.util.Scanner;

public class StringReverse {
	private String str1;
	private Scanner input;
	private String revStr;
	
	public void reverseString()
	{
		input = new Scanner(System.in);
		System.out.println("enter the string: ");
		str1 = input.nextLine();
		
		String revStr= "";
		
		for(int i=0; i<str1.length(); i++)
		{
	    char c = str1.charAt(i);
		revStr = Character.toString(c) + revStr;
		}
		System.out.printf("The reverse string is: %s", revStr);
}
}
