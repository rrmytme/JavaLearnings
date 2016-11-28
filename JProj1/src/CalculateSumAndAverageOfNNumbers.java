import java.util.Scanner;

public class CalculateSumAndAverageOfNNumbers {
	//Class members its advisable to keep class members always private
	private int n;
	private double sum;
	private Scanner input;
	
	public double getN ()
	{
		return n;
	}
	
	public double sum ()
	{
		return sum;
	}
	
	public double average ()
	{
		return sum/n;
	}
	
	public void start ()
	{
		input = new Scanner(System.in);
		System.out.print("Enter the no.of values:");
		n = input.nextInt();
		
		double nextN;
		for(int i=1; i<=n; i++)
		{
		 System.out.printf("Enter the numbers:");
		 nextN = input.nextDouble();
		 sum = sum+nextN;
		}
		 System.out.printf("\n The sum=%f and Average=%f", sum, average());
		
	}

}
