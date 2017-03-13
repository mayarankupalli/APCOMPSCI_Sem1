public class Lesson_053
{
	public static void main(String[]args)
	{
		if(tOrF())
		{
			System.out.println("it is true");
		}
		
		if(!tOrF())
		{
			System.out.println("it is false!");
		}
	}
	
	public static boolean tOrF()
	{
		return 2 >= 5;
	}
}



