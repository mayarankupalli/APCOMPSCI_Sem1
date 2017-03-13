import java.util.Scanner;
public class Lesson_061
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter the number of cookies: ");
		int cookies = kb.nextInt();
		int batch = 1;
		for(int needed = cookies; needed > 0; needed-=25)
		{
			System.out.println("cookies needed: " + needed);
			System.out.println("batch #:" + batch);
			batch++;
		}
		System.out.println("order up");
	}
}