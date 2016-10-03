import java.util.Scanner;
public class staticrectangle 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter your length: ");
		int l = kb.nextInt();
		System.out.print("Please enter your width: ");
		int w = kb.nextInt();
		
		print(calcPerim(l, w));
		
	}
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
	}
	public static void print(int perimeter)
	{
		System.out.println("the perimeter of your rectangle is " + perimeter);
	}
}