public class Party 
{
	private int guests;

	public int getGuest()
	{
		return guests;
	}

	public void setGuest(int numGuests)
	{
		guests = numGuests;
	}

	public void displayInvitation()
	{
		System.out.println("Please come to my party");
	}
}