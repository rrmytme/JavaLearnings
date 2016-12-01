
public class AccessSpecifierProtectedExample2 {
	protected String accountNumber="000101579552";
	protected String accountName="514222584";
	
	//Public is another access specifier and any classes can access public members
	public void accountDetails()
	{
		System.out.println("The Account number is: " + accountNumber + "\n" + "Account id is: " + accountName);
	}
}

class AccessProtectedSpecifierChild1
{
	public static void main(String[] args) {
	//Only Child classes can access protected members other classes can't	
	AccessProtectedSpecifierChild1 apr1 = new AccessProtectedSpecifierChild1();
	//The method accountDetails() is undefined for the type AccessProtectedSpecifierChild1
	//apr1.accountDetails();
	//accountName cannot be resolved or is not a field
	//System.out.println("Account Status: " + apr1.accountName.concat("-Premium")); 
	System.out.println("Cant access anything :( ");
	apr1=null;
	}
}

