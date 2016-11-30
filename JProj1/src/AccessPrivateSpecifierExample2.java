class AccessPrivateSpecifierExample2 
{
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

class AccessPrivateSpecifierChild extends AccessPrivateSpecifierExample2
{
	public static void main(String[] args) 
	{
		//Child classes can't access private members through public members		
		AccessPrivateSpecifierChild b = new AccessPrivateSpecifierChild();
		b.accountDetails();
		//The field AccessPrivateSpecifierExample2.accountNumber is not visible
		//b.accountNumber;
		b=null;
		
	}

}
