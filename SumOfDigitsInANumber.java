package ImportantJavaPrograms;

import java.util.Scanner;
import java.util.Random;

public class SumOfDigitsInANumber {
private int in;
private int sum=0;

public void sumOfDigitsInANumber()
{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number: ");
	in=input.nextInt();
		
	while(in>0)
	{
		int remainder = in%10;
		sum += remainder;
		in /= 10;
	}
	System.out.println(sum);
}
}
