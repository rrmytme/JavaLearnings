import java.util.Scanner;

public class Histogram {
	private int a;
	private Scanner input;
	
	public void readInput()
	{
		input = new Scanner(System.in);
		System.out.println("Enter the value to draw the Histogram: ");
		a = input.nextInt();
		input = null;
	}

	public void drawHistogram()
	{
		for(int i=1; i<=a; i++)
		{
			System.out.print("*");
		}
	}
}
