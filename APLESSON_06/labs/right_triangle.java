import java.util.Scanner;
public class right_triangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the word:");
		String word = kb.next();
		
		for(int i = word.length(); i >= 0 ; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}