import java.util.Scanner;
public class graph_table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the size of the table and the number");
		int size = kb.nextInt();
		int num = kb.nextInt();
		for(int i = 1; i <= size; i++)
		{
			int product = num * size;
			System.out.printf("%5d  |  %5d\n", i, i * product);
		}
		
	}
}