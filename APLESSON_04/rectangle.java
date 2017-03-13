import java.util.Scanner;
public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the length");
		l = kb.nextDouble();
		System.out.println("enter the width");
		w = kb.nextDouble();
		
		perimeter = (2*l)+(2*w);
		method1();
		
	}
	public static void method1()
	{
		System.out.println("Your rectangle is " + perimeter + "ft around.");
	}
}