import java.util.Scanner;
public class password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		passCheck();
		
	}
	
	public static void passCheck()
	{
		System.out.println("enter the username");
		String choice = kb.next();
		if(choice.equals("username"))
		{
			System.out.println("enter the password");
			if (choice.equals("password"))
				System.out.println("You are granted access!");
			else
				System.out.println("your password is incorrect");
				
		}
		else
		{
			System.out.println("your username incorrect");
			passCheck();
		}
			
		
	}
}