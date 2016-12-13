package ImportantJavaPrograms;
import java.util.Scanner;

public class Factorial {
	
	private int factValue;
	private Scanner input;
	
	public void readInput()
	{
		input = new Scanner(System.in);
		System.out.print("Enter the value: ");
		factValue = input.nextInt();
	    input=null;
	}

	public void calculateFact()
	{
		int fact = 1;
		for(int i=1; i<=factValue; i++)
		{
			fact *= i;
		}
		System.out.printf("The Factorial is: %d", fact);
	}
}
