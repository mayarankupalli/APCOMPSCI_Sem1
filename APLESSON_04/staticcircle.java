import java.util.Scanner;
public class staticcircle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		staticcircle form = new staticcircle();
		System.out.println("enter the radius");
		double r = kb.nextDouble();
		
		
		print(r, calcArea(r));
		
	}
	public static double calcArea(double r)
	{
		return 3.14*r*r;
	}
	public static void print(double r, double Area)
	{
		System.out.printf("The area of the circle with a radius of " + r + " is %5.5f" , Area);
	}
}