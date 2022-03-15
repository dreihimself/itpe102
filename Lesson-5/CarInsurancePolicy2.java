public class CarInsurancePolicy2
{
	private int num;
	private int payments;
	private String city;

	public CarInsurancePolicy2(int num, int numPayments, String city)
	{
		this.num = num;
		this.payments = payments;
		this.city = city;
	}

	public CarInsurancePolicy2(int num, int payments)
	{
		this(num, payments, "Mayfield");
	}

	public CarInsurancePolicy2(int num)
	{
		this(num, 0, "Atlanta");
	}

	public void display()
	{
		System.out.println("Policy # " + num + ". " +
		payments + " payments annually. Driver resides in " +
		city + ".");	
	}

}