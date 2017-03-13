import java.util.Scanner;

public class Lab_04_Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Ex_02 form = new Lab_04_Ex_02();
		
		System.out.println("Enter your first name");
		String firstname = kb.nextLine();
		
		System.out.println("enter your last name");
		String lastname = kb.nextLine();
		
		System.out.println("Enter your title");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site");
		String site = kb.nextLine();
		
		System.out.println("Enter the school year");
		String year = kb.nextLine();
		
		System.out.println("What is your subject");
		String subject = kb.nextLine();
		System.out.println("***************************");
		form.format(site, year);
		form.format(firstname, lastname);
		form.format(title, subject);
		System.out.println("***************************");
	}
	public void format(String site, String year)
	{
		System.out.printf("*%7s%15s*\n", site, year);
	}
}
