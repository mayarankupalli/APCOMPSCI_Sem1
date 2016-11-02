import java.util.Scanner;
public class averagedigits
{
	static int digits = 0;
	static int average = 0;
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number");
		number = kb.nextInt();
		
		avDigits();
		System.out.println("the average of the digits in " + number + " is " + average);
	}
	public static void avDigits()
	{	
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += num % 10;
			num /=  10;
		}
		average = average/digits;
	}
}