public class TestCustomers
{
	public static void main(String[] args)
	{
		Customer oneCust = new Customer(124, 123.45);
		PreferredCustomer onePcust = new PreferredCustomer(125, 3456.78, 0.15);

		oneCust.display();
		onePcust.display();
	}
}