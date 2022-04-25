public class ThreadDemo
{
	public static void main(String[] args) 
	{
		CountThread cd = new CountThread();
		HelloThread hd = new HelloThread();

		cd.start();
		hd.start();
	}
}

