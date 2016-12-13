package ImportantJavaPrograms;

public class ExceptionHandlingExamples 
{
	
/*public void arithmaticExceptions()
{
	try
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("The result is: " +c);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("The Error is: " + e);
	}
	//Java.lang.StackTraceElement;@15db974
*/	
	
/*public void nullPointerExceptions()
	{
		try
		{
			String str = null;
			char d = str.charAt(4);
			System.out.println("The Character is: " +d);
		}
		
		catch(NullPointerException f)
		{
			System.out.println("The Error is: " + f);
		}
		//java.lang.StackTraceElement;@15db9742
*/
	
/*public void stringIndexOutOfBoundException()
	{
		try
		{
			String str = "Rajesh";
			char a = str.charAt(7);
			System.out.println("The Character is: " +a);
		}
		
		catch(StringIndexOutOfBoundsException g)
		{
			System.out.println("The Error is: " + g);
		}
*/

/*public void classNotFoundException()
	{
		try
		{
			Class.forName("myclass");
		}
		
		catch(ClassNotFoundException h)
		{
			System.out.println("The Error is: " + h);
		}
*/	
	
/*public void arrayIndexOutOfBoundException()
	{
		try
		{
			String[] str1 = new String[5];
			System.out.println("print array index: " + str1[7]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("The Error is: " + i);
		}
*/
	
/*public void numberFormatException()
	{
		try
		{
			String str2 = "Rajesh";
			//String str2 = "10"; if you put any integers within double quotes this function work otherwise
			//throws exception
			int i = Integer.parseInt(str2);
			System.out.println(str2);
			
		}
		
		catch(NumberFormatException j)
		{
			System.out.println("The Error is: " + j);
		}
*/
	
/*public void finallyBlock()
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The result is: " +c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("The Error is: " + e);
		}
		
		finally
		{
			System.out.println("print finally");
		}
		
		System.out.println("Finished");
*/

/* here we used throws keyword to avoid try&catch blocks
 * can use throw keyword only within a function
 
	public void alternateWayForExceptionHandling() throws ArithmeticException
	{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The result is: " +c);				
	}
*/
	
}
