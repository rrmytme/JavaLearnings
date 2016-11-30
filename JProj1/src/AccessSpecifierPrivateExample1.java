
public class AccessSpecifierPrivateExample1 {
		//Private is a access specifier
		//Only the class who creates the private data can use the same data or methods 
		//other classes or sub classes can't use the Private data
		
		private String accountNumber="000101579552";
		private String accountName="514222584";
		
		public void accountDetails()
		{
			System.out.println("The Account number is:" + accountNumber + "\n" + "Account id is: " + accountName);
		}

		public static void main(String[] args) 
		{
		    AccessSpecifierPrivateExample1 a = new AccessSpecifierPrivateExample1();
			a.accountDetails();
			a=null;
		}
	}

