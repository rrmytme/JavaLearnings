package ImportantJavaPrograms;

import java.util.Scanner;
public class CustomExceptionExample extends Exception
{
	CustomExceptionExample(String s)
	{
		System.err.println(s);
	}
	
	public static void main(String[] args) 
	{
		try
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = input.nextInt();
		
		if (a%5==0)
		{
		throw new CustomExceptionExample("Cant enter a value divisible by 5");
		}
	}
		catch(CustomExceptionExample e)
	{
		
	}
}
}
