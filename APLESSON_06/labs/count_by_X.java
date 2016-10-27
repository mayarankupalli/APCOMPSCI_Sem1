import java.util.Scanner;
public class count_by_X
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number");
		int num = kb.nextInt();
		System.out.println("enter the iteration");
		int it = kb.nextInt();
		for(int i = 0; i <= num; i+= it)
		{
			System.out.print(i + " ");
		}
	}
}