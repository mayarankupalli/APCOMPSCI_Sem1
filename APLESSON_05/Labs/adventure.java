import java.util.Scanner;
public class adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("There once was a boy named Ned who lived in scotland: was he a farmer or a wizard?");
		String job = kb.next();
		if(job.equals("farmer"))
		{
			System.out.println("he had been a farmer since he was born: did he hate or love his job?");
			String jobfeelings = kb.next();
			if(jobfeelings.equals("love"))
			{
				System.out.println("Ned planted 100 mango trees: did they grow die?");
				String trees = kb.next();
				if(trees.equals("grow"))
				{
					System.out.println("Ned lived on his farm until he died and became a part of his farm");
				}
				else
				{
					System.out.println("Ned moved to America and became the CEO of a mango juice company");
				}
			}
			else
			{
				System.out.println("Ned decided to move: did he go to Australia or South Africa?");
				String move = kb.next();
				if(move.equals("Australia"))
				{
					System.out.println("After finding work in a kangaroo farm, Ned was kicked by one of the animals and died");
				}
				else
				{
					System.out.println("He was accepted into a local tribe and became the clan leader");
				}
			}
		}
		
		else 
		{
			System.out.println("He had been attending the Scotland Wizarding school for years: did he hate or love school?");
			String schoolfeelings = kb.next();
			if(schoolfeelings.equals("love"))
			{
				System.out.println("Ned did very well in school: what was his favorite subject potions or herbology?");
				String subject = kb.next();
				if(subject.equals("potions"))
				{
					System.out.println("After graduating he moved to London and began teaching under the name Snape");
				}
				else
				{
					System.out.println("Ned was attacked by a vicious magical plant and died");
				}
			}
			else
			{
				System.out.println("Ned dropped out of school: did he go into farming or did he move to Australia?");
				String dropped = kb.next();
				if(dropped.equals("farming"))
				{
					System.out.println("He grew coconuts, but one day he died after a coconut fell on his head");
				}
				else
				{
					System.out.println("After finding work in a kangaroo farm, Ned was kicked by one of the animals and died");
				}
			}
		}
	}
		
		
	}
	
		
