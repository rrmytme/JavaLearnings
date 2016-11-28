import java.util.Scanner;

public class DisplayASCIIValues {
	private String strInput;
	private Scanner input;
		
	public String readInput()
	{
		input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		strInput = input.nextLine();
		
		return strInput;
	}
	
	public void diplayASCII()	
	{
		char c;
		for(int i=0; i<strInput.length()-1; i++)
		{
			c= strInput.charAt(i);
			System.out.printf("The string character is: %c and ASCII value is: %d \n", c, (int)c);
		}
	}
	
	

}
