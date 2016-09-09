import java.util.Scanner; //import Statement 

public class lab_03_EX_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("what is the width");
		Double width = keyboard.nextDouble();
		System.out.println("what is the height?");
		Double height = keyboard.nextDouble();
		System.out.println("what is the length?");
		Double length = keyboard.nextDouble();
		Double volume = width*height*length;
		System.out.println("your volume is " + volume);
		
	}
}

		