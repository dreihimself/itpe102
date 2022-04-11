public class DinnerPartyWithConstructor2 extends PartyWithConstructor2
{
	private int dinnerChoice;

	public DinnerPartyWithConstructor2(int numGuests, int a)
	{
		super(numGuests);
		dinnerChoice = a;
	}

	public int getDinnerChoice()
	{
		return dinnerChoice;
	}

	public void setDinnerChoice(int choice)
	{
		dinnerChoice = choice;
	}

	public void displayInvitation()
	{
		System.out.println("Please come to my dinner party");
	}
}