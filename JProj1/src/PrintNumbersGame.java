
public class PrintNumbersGame {

	public static void main(String[] args) {
		//Print numbers 2 to 200 in 8 numbers in a row
		
	int count;
	int lc;
	
	for(count=2, lc=1; count<=200; count+=2, lc++)
	{
		System.out.printf("%4d", count);
		if(lc%10 == 0)
			System.out.printf("\n");
	}
	}
}
