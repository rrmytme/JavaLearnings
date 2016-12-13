package ImportantJavaPrograms;

import java.util.Scanner;

public class PrintArrayValuesInReverse {
	
	   public static void main(String[] args)
	   {	
		double[] a = readInputs(7);
		printReversed(a);
	   }
		
		public static double[] readInputs(int inputs)
		{
			System.out.println("Enter no.of Inputs: " + inputs);
			Scanner in = new Scanner(System.in);
			double[] input = new double[inputs];
			for(int i=0; i<input.length; i++)
			{
				input[i]=in.nextDouble();
			}
			return input;
		}
		
		public static void printReversed(double[] values)
		{
			for(int i=values.length-1; i>=0; i--)
			{
				System.out.println(values[i] + " ");
			}
			
}
}


