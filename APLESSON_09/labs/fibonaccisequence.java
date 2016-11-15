import java.util.Scanner;
public class fibonaccisequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] seq = new int[10];
		System.out.println("please enter your starting number ");
		int start = kb.next();
		System.out.println("enter your sequence size ");
		int seq = kb.next();
	
		for(int i = 0; i < seq.length; i++)
		{
			if(i = 0 || i = 1)
				seq[i] = start
			
			else
				seq[i] = 
			System.out.println(seq[i] + " ");
		}
		
	}
}