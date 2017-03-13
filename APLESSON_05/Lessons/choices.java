import java.util.Scanner;
public class choices
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("would you like to..." +
							"\n 1. Do a math problem" +
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("what is 2 x 2?");
			int mathAnswer = kb.nextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct");
			}
			else
				System.out.println("no!");
		}
		else
		{
			System.out.println("who said the phrase \"whatever you are, be a good one.\"?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Abraham Lincoln"))
			{
				System.out.println("correct");
			}
			else
				System.out.println("no!");
		}
	}
}