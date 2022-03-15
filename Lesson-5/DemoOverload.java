public class DemoOverload 
{
	public static void main(String[] args)
	{
		int month = 3, day = 9, year = 2022;

		displayMonth(month);
		displayMonth(month,day);
		displayMonth(month,day,year); 
	}

	public static void displayMonth(int mm)
	{
		System.out.println("Event date " + mm + "/10/2022");
	}

	public static void displayMonth(int mm, int dd)
	{
		System.out.println("Event date " + mm + "/" + dd + "/10/2022");
	}	

	public static void displayMonth(int mm, int dd, int yy)
	{
		System.out.println("Event date " + mm + "/" + dd + "/" + yy);
	}		
}

