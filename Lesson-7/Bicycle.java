import javax.swing.*;

public class Bicycle extends Vehicle
{
	public Bicycle()
	{
		super("a person", 2);
	}

	@Override
	public void setPrice()
	{
		String entry;
		final int MAX = 4000;

		entry = JOptionPane.showInputDialog(null, "Enter bicyle price");
		price = Integer.parseInt(entry);

		if(price > MAX) 
			price = MAX;
	}

	@Override
	public String toString()
	{
		return("The bicyle is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $ " + getPrice());
	}
}