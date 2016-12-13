package ImportantJavaPrograms;
import java.util.Scanner;

public class PrimeNumbers {
	private int numberInput;
	private Scanner input;
	
	public void primeNumers()
	{
		input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		numberInput = input.nextInt();
	
		Boolean prime = true;
		for(int i=2; i<numberInput; i++)
		{
			if(numberInput % i == 0)
			{
			prime = false;
			}			
		}
		
		if(prime == false)
		{
			System.out.println(numberInput + ": is not a prime number");
		}
		else if(prime == true)
		{
			System.out.println(numberInput + ": is a prime number");
		}
		
	}
}

