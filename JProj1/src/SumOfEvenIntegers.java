
public class SumOfEvenIntegers {
		
	public int printNumbers()
	{
		int sum=0;
		int i;
		
		for(i=2; i<100; i+=3)
		{
			if(i%5==0)
			{
			sum += i;
			}
		}
		
		System.out.printf("The sum is: %d", sum);
		return sum;
	}
}
