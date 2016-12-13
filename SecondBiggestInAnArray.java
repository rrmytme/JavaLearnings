package ImportantJavaPrograms;

public class SecondBiggestInAnArray {
	
	public void getSecondBiggest()
	{
	int[] a = {12,1,34,21,56,43,2,6,78};
	int biggest=0;
	int secondBiggest=0;
	
	for(int i=0; i<a.length;i++)
	{
		if(a[i]>biggest)
		{
			secondBiggest=biggest;
			biggest=a[i];
		}
		else if(secondBiggest<a[i])
		{
			secondBiggest=a[i];
		}
	}
	System.out.print("The Biggest number is: ");
	System.out.print(biggest);
	System.out.print("\nThe Second biggest number is: ");
	System.out.print(secondBiggest);
	}
}
