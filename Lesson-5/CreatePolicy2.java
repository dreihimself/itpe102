public class CreatePolicy2
{
	public static void main(String[] args)
	{
		CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
		CarInsurancePolicy2 second = new CarInsurancePolicy2(456,4);

		first.display();
		second.display();

	}
}