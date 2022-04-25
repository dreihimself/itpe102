import java.util.Date;

public class DateRunnable implements Runnable
{
	private Date date;
	private static final int TIMES = 10;

	public DateRunnable(Date date)
	{
		this.date = date;
	}

	@Override
	public void run()
	{
		for(int i=0; i<TIMES; i++)
		{
			try
			{
				Date nowDate = new Date();

				System.out.println("Started: " + this.date + " Now " + nowDate);

				int pause = (int)(Math.random() * 3000);

				Thread.sleep(pause);
			} 
			catch(InterruptedException e)
			{
				System.out.println(e.toString());
			}
		}
	}
}