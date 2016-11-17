import java.util.Scanner;
public class findthezs
{
	static String [] words;
	public static void main(String[]args)
	{
		words = new String[5];
		
		fillArray(words);
		System.out.println("for the following words ");
		printArray(words);
		System.out.println(" ");
		System.out.println("The words that have zs are: " + hasZs(words));
	}
	
	public static void fillArray(String[] n)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter five words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}	
	}
	
	public static void printArray(String[] n)
	{
		for(String word : words)
			System.out.print(word + " ");
	}
	
	public static String hasZs(String[] n)
	{
		String zs = "";
		for(String words : n)
		{
			if(words.indexOf("z") >= 0)
				zs += words + " ";
		}
		return zs;
	}
}