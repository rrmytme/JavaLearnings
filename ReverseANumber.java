package ImportantJavaPrograms;

import java.util.Scanner;

public class ReverseANumber {
	private int original;
	private int reverse=0;
	
	public void reverseNumber()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		original = input.nextInt();
		
		while(original !=0)
		{
			int remainder=original%10;
			reverse=reverse*10+remainder;
			original=original/10;
		}
		System.out.println("The reverse number is " + reverse);
	}
}
