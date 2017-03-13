import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter 3 words ");
		String one = kb.nextLine();
		String two = kb.nextLine();
		String three = kb.nextLine();
		System.out.println(makeCenter(one));
		System.out.println(makeCenter(two));
		System.out.println(makeCenter(three));
		
	}
	public static String makeCenter(String word)
	{
		if (word.length() >= 20) 
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}