public class StringAndStringBuilderandStringBufferComparison {

public static void main(String args[])
{
	//String operation time taken
	long startTime1 = System.currentTimeMillis();
	for(int i=0; i<500000; i++);
	{
	String str1 = "Rajesh";
	String str2 = str1.concat("-Kids"); 
	System.out.print(str2);
	}
	long endTime1 = System.currentTimeMillis();
	System.out.printf("\nTotal time taken for string operation is: \n"+(endTime1 - startTime1)+"ms"); 
	
	//StringBuilder is not thread safe and it will take less time
	long startTime2 = System.currentTimeMillis();
	for(int i=0; i<500000; i++);
	{
	StringBuilder str3 =  new StringBuilder("\n\nOld string");
	str3.append("-New string \n");
	System.out.print(str3);
	}
	long endTime2 = System.currentTimeMillis();
	System.out.printf("Total time taken for stringBuilder operation is: \n"+(endTime2 - startTime2)+"ms"); 
	
	//StringBuffer is thread safe and it will take time
	long startTime3 = System.currentTimeMillis();
	for(int i=0; i<500000; i++);
	{
	StringBuffer str4 = new StringBuffer("\n\nGoodBoy");
	str4.append("-Rajesh \n");
	System.out.print(str4);
	}
	long endTime3 = System.currentTimeMillis();
	System.out.printf("Total time taken for stringBuffer operation is: "+(endTime3 - startTime3)+"ms"); 
	}
}
