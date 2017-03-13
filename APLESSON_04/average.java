import java.util.Scanner;
public class average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		average form = new average();
		System.out.println("enter the first number");
		num1 = kb.nextDouble();
		System.out.println("enter the second number");
		num2 = kb.nextDouble();
		System.out.println("enter the third number");
		num3 = kb.nextDouble();
		
		
		method1();
		print();
	}
	public static void method1()
	{
		avg = (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.printf("the average of " + num1 + ", " + num2 + ", and " + num3 + " is %2.5f" , avg);
	}
}