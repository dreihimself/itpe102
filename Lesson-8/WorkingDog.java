public class WorkingDog extends Dog implements Worker
{
	private int hoursOfTraining;

	public void setHoursOfTraining(int hrs)
	{
		hoursOfTraining = hrs;
	}

	public int getHoursOfTraining()
	{
		return hoursOfTraining;
	}

	@Override
	public void work()
	{
		speak();
		System.out.println("I am dog who works");
		System.out.println("I have " + hoursOfTraining + " hours of professional training");
	}
}

