package ImportantJavaPrograms;

public class SortAnIntegerArray 
{
	private int[] a = {123,434,11,23,43,56,30,98,11123};
	
	public void sortElements()
	{
	int temp=0;
	//Print the array values before sorting
	System.out.println("The array values before sorting: \n");
	for (int value : a)
	{
		System.out.println(value);
	}
	
	for(int i=0; i<a.length; i++)
	{
		for(int j=1; j<a.length-1; j++)
		{
			if(a[j-1]>a[j])
			{
				temp = a[j-1];
				a[j-1]=a[j];
				a[j]=temp;	
			}
		}
	}
	
	System.out.println("The array values after sorting: \n");
	
	for(int value1: a)
	{
		System.out.println(value1);
	}
}
}
