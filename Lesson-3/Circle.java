import java.util.Scanner;

public class Circle 
{
	public static void main(String[] args) 
	{
		double radius;
		double PI = 3.1416;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle >> ");
		radius = sc.nextDouble();

		double area = 2*(PI*radius);

		System.out.print("The circumference of the cirle is " + area);

	}
}