import java.util.Date;

public class RunnableMessageDate
{
	public static void main(String[] args) 
	{
		MessageRunnable mr = new MessageRunnable("Hello");
		DateRunnable dr = new DateRunnable(new Date());

		Thread mt = new Thread(mr);
		Thread dt = new Thread(dr);

		mt.start();
		dt.start();
	}
}

