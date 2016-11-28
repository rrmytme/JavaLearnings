import java.util.Scanner;

public class StringEncodingCallFromMyMain {
	private String originalString;
	private String resultString;
	private Scanner input;
	
	public void getInput()
	{
		input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		originalString = input.nextLine();	
	}
	
	public String encodeInput()
	{
		resultString = new String();
		resultString = "";
		
		char c;
		for(int i=0; i<originalString.length()-1; i++)
		{
			c = originalString.charAt(i);
			c = (char)((int)c-1);
		resultString += Character.toString(c);			
		}
		return resultString;
	}

}
