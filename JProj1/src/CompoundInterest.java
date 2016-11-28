
public class CompoundInterest {

	public static void main(String[] args) {
		int p = 10000;
		int n = 5;
		double r = 0.5;
		// compound interest formula is interest = principle amount (1+interest rate) power of no.of years
		double f = p * Math.pow(1+r, n);
	System.out.printf("The compound interest is %f:", f);
	}

}
