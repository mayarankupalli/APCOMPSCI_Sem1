import java.util.Scanner;
public class reverseword
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("please enter 5 words ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		for(String word : words)
			System.out.println(word);
		System.out.println();
		reversed(words);
	}
	
	public static void reversed(String[] words)
	{
		for(int i = words.length-1; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
	}
}