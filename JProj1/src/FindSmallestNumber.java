import java.util.Scanner;

public class FindSmallestNumber {
	private Scanner input;

	public void FindSmallest()
	{
		input = new Scanner(System.in);
		System.out.println("Enter no.of values to compare: ");
		int totalNumbers = input.nextInt();
		
		int i, t;
		int small = 0;
		for(i=1; i<=totalNumbers; i++)
		{
			t = input.nextInt();
			
			if(i==1)
			small = t;
			else 
			{
				if(small>t)
				small = t;
			}
		}
		System.out.printf("The Smallest number is: %d", small);
	}

}
