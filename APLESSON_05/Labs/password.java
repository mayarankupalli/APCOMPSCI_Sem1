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
		String username = kb.next();
		System.out.println("enter the password");
		String password = kb.next();
		
		if(username.equals("username") && password.equals("password"))
		{
			System.out.println("You are granted access!");	
		}
		else
		{
			if(username.equals(username))
			{
				System.out.println("your password is incorrect");
				passCheck();
			}
			else if(password.equals(password))
			{
				System.out.println("your username is incorrect");
				passCheck();
			}
			else
			{
				System.out.println("your username and password are incorrect");
				passCheck();
			}
			
		}
	}
}