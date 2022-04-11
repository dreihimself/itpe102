import java.util.*;

public class UseDinnerParty2
{
	public static void main(String[] args) {
		int guests;
		int choice;

		DinnerParty2 aDinnerParty = new DinnerParty2();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of guests for the dinner party >>> ");
		guests = keyboard.nextInt();
		aDinnerParty.setGuest(guests);

		System.out.print("Enter the menu option -- 1 for chicken or for beef >>> ");
		choice = keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);

		System.out.println("The dinner party has " + aDinnerParty.getGuest() + " guests ");
		System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");

		aDinnerParty.displayInvitation();

	}
}