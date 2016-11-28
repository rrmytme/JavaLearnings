import java.util.Scanner;

public class CountLettersNumbersSpacesInAString {
	private String str1;
	private Scanner input;
	
	public void readInput()
	{
		input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		str1 = input.nextLine();
		input = null;
	}
	
	public void stringAnalysis()
	{
		char c;
		int lettersCount =0, numbersCount=0, spaceCount=0, othersCount=0;
		
		for(int i=0; i<str1.length()-1; i++)
		{
		c = str1.charAt(i);
		if ((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
		lettersCount++;
		if (c>='0'&&c<='9')
		numbersCount++;
		if ((c=='\t')||(c==' ')||(c=='\n'))
		spaceCount++;
		else
		othersCount++;
		}
		
		System.out.printf("The Letter count in the string is: %d\n", lettersCount);
		System.out.printf("The Numbers count in the string is: %d\n", numbersCount);
		System.out.printf("The space count in the string is: %d\n", spaceCount);
		System.out.printf("The Special characters count in the string is: %d", othersCount);
	}

}
