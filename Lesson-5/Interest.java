public class Interest {
	public static void main(String[] args)
	{
		calculateInterest(500,10);
		calculateInterest(1000.00, 0.04);
	}

	public static void calculateInterest(double bal, double rate)
	{
		double interest;
		interest = bal * rate;

		System.out.println("Simple interest on $" + bal + " at rate is "
		+ rate + " % rate is " + interest);
	}
	
	public static void calculateInterest(double bal, int rate)
	{
		double interest, rateAsPercent;
		rateAsPercent = rate / 100.0;

		interest = bal * rateAsPercent;
		System.out.println("Simple interest on $" + bal + " at rate is "
		+ rate + " % rate is " + interest);
	}
}

