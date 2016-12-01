class AccessSpecifierProtectedExample1 {
	protected String accountNumber="000101579552";
	protected String accountName="514222584";
	
	public void accountDetails()
	{
		System.out.println("The Account number is: " + accountNumber + "\n" + "Account id is: " + accountName);
	}

}

class AccessProtectedSpecifierChild extends AccessSpecifierProtectedExample1
{
	public static void main(String[] args) {
	//Only Child classes can access protected members other classes can't	
	AccessProtectedSpecifierChild apr = new AccessProtectedSpecifierChild();
	apr.accountDetails();
	System.out.println("Account Status: " + apr.accountName.concat("-Premium")); 	
	apr=null;
	}
}
