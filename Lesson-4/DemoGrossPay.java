/*
	 Method that requires multiple parameters
*/
public class DemoGrossPay
{
	public static void main(String[] args) 
	{
		double hours = 25;
		double yourHoursWorked = 37.5;

		calculateGross(10);
		calculateGross(hours);
		calculateGross(yourHoursWorked);
	} 

	/**
	* Calculate gross pay based from given hours and rate (hours, rate)
	* @param hours The number of hours
	* @param rate The rate per hour
	* @return Calculated gross pay
	*/
	public static double calculateGross(double hours, double rate) 
	{
		double gross;
		gross = hours * rate;

		return gross;
	}
}

