public class Student2
{
	private int stuNum;
	private double gpa;

	public Student2(int num, double avg)
	{
		stuNum = num;
		gpa = avg;
	}

	public Student2(double avg)
	{
		this(999,avg);
	}	

	public Student2(int num)
	{
		this(num, 0.0);
	}	

	public Student2()
	{
		this(999, 0.0);
	}	
}


