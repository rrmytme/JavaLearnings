package ImportantJavaPrograms;

public class NumberSwappingWithoutTempVariabel {
	
	public void swapMethod1()
	{
	int a = 10;
	int b = 12;
	
	a=a+b; //10+12=22
	b=a-b; //22-12=10
	a=a-b; //22-10=12
	
	System.out.print("The value of a is: ");
	System.out.print(a);
	System.out.print("\nThe value of b is: ");
	System.out.print(b);
	}
	
	public void swapMethod2()
	{
	int a = 10;
	int b = 12;
	
	//here we are using XOR bitwise operator 
	//the logic is if you do bit operation for 2 numbers EX: 100 and 110 the output is 010
	//because for XOR same values -> 0 different values -> 1
	
	a=a^b; // a=10-> 1010 ^ b=12-> 1100 so the output is 0110
	b=a^b; // a=0110 ^ b=1100 output-> b=1010->10
	a=a^b; // a=0110 ^ b=1010 output-> a=1100->12
	
	System.out.print("\nThe value of a is: ");
	System.out.print(a);
	System.out.print("\nThe value of b is: ");
	System.out.print(b);
	}

}
