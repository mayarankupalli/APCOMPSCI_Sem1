import java.util.Scanner;
public class adventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		recursion();
		
	}
	public static void recursion()
	{
		System.out.println("There once was a boy named Ned who lived in scotland: was he a farmer or a wizard?");
		String job = kb.next();
		if(job == farmer)
		{
			System.out.println("he had been a farmer since he was born: did he hate or love his job?");
			String jobfeelings = kb.next();
			if(jobfeelings == love)
			{
				System.out.println("Ned planted 100 mango trees: did they grow die?");
			}
			else
			{
				System.out.println("Ned decided to move: did he go to Australia or South Africa?")
			}
		}
		
		else 
		{
			System.out.println("He had been attending the Scotland Wizarding school for year: did he hate or love school?");
			string schoolfeelings = kb.next();
			if(schoolfeelings == love)
			{
				System.out.println("Ned did very well in school: what was his favorite subject potions or herbology?")
			}
			else
			{
				System.out.println("Ned dropped out of school: did he go into farming or did he move to Australia?")
			}
		}
	}
}