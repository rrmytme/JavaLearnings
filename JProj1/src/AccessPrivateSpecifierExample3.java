
public class AccessPrivateSpecifierExample3 {
	//Private is a access specifier
	//Only the class who creates the private data can use the same data or methods 
	//other classes or sub classes can't use the Private data
	private String accountNumber="000101579552";
	private String accountName="514222584";
	
	public void accountDetails()
	{
		System.out.println("The Account number is:" + accountNumber + "\n" + "Account id is: " + accountName);
	}
}

class AccessPrivateSpecifierChild1
{
public static void main(String[] args) 
{
//Other classes even can't access private members through public member functions		
AccessPrivateSpecifierChild1 c = new AccessPrivateSpecifierChild1();
//The method accountDetails() is undefined for the type AccessPrivateSpecifierChild
//b.accountDetails();
//The field AccessPrivateSpecifierExample2.accountNumber is not visible
//b.accountNumber;
c=null;
}

}
