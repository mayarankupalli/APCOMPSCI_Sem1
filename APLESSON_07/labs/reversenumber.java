import java.util.Scanner;
public class reversenumber
{
	
	static int rev = 0;
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number");
		number = kb.nextInt();
		getReverse();
		System.out.println(number + " reversed is " + rev);
		
	}
	public static void getReverse()
	{	
		int num = number;
		while(num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /=  10;
		}
		
	}
}