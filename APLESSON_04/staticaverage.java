import java.util.Scanner;
public class staticaverage
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		staticaverage form = new staticaverage();
		System.out.println("enter the first number");
		double one = kb.nextDouble();
		System.out.println("enter the second number");
		double two = kb.nextDouble();
		System.out.println("enter the third number");
		double three = kb.nextDouble();
		
		print(one, two, three, calcAverage(one, two, three));

		
	}
	public static double calcAverage(double one, double two, double three)
	{
		return (one+two+three)/3.0;
	}
	public static void print(double one, double two, double three, double average)
	{
		System.out.printf("the average of " + one + ", " + two + ", and " + three + " is %2.5f" , average);
	}
}