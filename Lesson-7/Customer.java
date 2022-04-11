public class Customer
{
	private int idNumber;
	private double balancedOwned;

	public Customer(int id, double bal)
	{
		idNumber = id;
		balancedOwned = bal;
	}

	public void display()
	{
		System.out.println("Customer # " + idNumber + " Balance $" + balancedOwned);
	}
}