import java.util.Scanner;
public class digitadder
{
	
	static int sum = 0;
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number");
		number = kb.nextInt();
		sumDigits();
		System.out.println("the sum of the digits in " + number + " is " + sum);
		
	}
	public static void sumDigits()
	{	
		int num = number;
		while(num > 0)
		{
			sum += num % 10;
			num /=  10;
		}
		
	}
}