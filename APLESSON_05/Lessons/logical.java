import java.util.Scanner;
public class logical
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		checkNum();
		
	}
	public static void checkNum()
	{
		System.out.println("pick and number between 1 and 10: ");
		int guess = kb.nextInt();
		int number = (int)(Math.random()*10)*1;
		System.out.println("the number is " + number);
		if(guess >= 1 && guess <= 10)
		{
			if(guess == number)
				System.out.println("the number is right!");
			else
					System.out.println("wrong");
		}
		else
		{
			System.out.println("please make it a 1-10");
			checkNum();
		}
	}
}