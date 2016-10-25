import java.util.Scanner;
public class Lesson_062
{
	public static void main(String[]args)
	{
		//String word = "COMPSCI";
		//System.out.println(word.length());
		//System.out.println(word.indexOf("S");
		//System.out.println(word.substring(2));
		//System.out.println(word.charAt(2));
		
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a word" );
		String word = kb.next();
		
		for(int i = 0; i <= word.length(); i++)
		{
			//System.out.println(word.charAt(i));
			System.out.println(word.substring(0, i));
		}
	}
}