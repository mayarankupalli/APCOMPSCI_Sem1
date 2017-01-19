import java.util.Scanner;
public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		User user1;
		System.out.println("Please enter your first name: ");
		String first = kb.nextLine();
		System.out.println("Please enter your last name: ");
		String last = kb.nextLine();
		System.out.println("would you like to use a public avatar?");
		String choice = kb.nextLine();
		if (choice.equals("n"))
		{
			user1 = new User (first, last);
		}
		else
		{
			System.out.println("Please enter your avatar: ");
			String avatar = kb.nextLine();
			user1 = new User (first, last, avatar);
		}
		
		System.out.println(user1);
		user1.setavatar("Profhansizzle");
		System.out.println("\n" + user1);
		
		
	}
	
	
}