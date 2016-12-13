package ImportantJavaPrograms;

import java.util.Scanner;
public class FibonacciSeries {
	private int a=0;
	private int b=1;
	private int c,n;
	
	public void fibonacciSeries()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers? ");
		n=input.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2; i<n; i++)
		{
			c=a;
			a=b;
			b=a+c;
						
			System.out.println(b);	
		}
	}

}
