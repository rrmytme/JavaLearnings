import java.util.Scanner;

public class StringAnalysisVowelsandConsonants {
private String str1;
private Scanner input;
private int vowelCount=0;
private int consonantCount=0;

public void vowelsandConsonantsAnalysis()
{
	input = new Scanner(System.in);
	System.out.println("Enter the string: ");
	str1 = input.nextLine();
	
	for(int i=0; i<str1.length()-1; i++)
	{
		char c= str1.charAt(i);
				
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
		{
			vowelCount += 1;
		}
		else 
			consonantCount += 1;
	}
	
	System.out.printf("The VowelCount is: " + vowelCount + "\nThe Consonant count is: " + consonantCount );
}
}
