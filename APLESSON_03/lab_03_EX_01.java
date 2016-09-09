import java.util.Scanner; //import Statement

public class lab_03_EX_01
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("what is your name");
		
		//search for the next integer that the user enters
		String name = keyboard.next();
		//print the results...
		System.out.println("ewww " + name + " is a really gross name...lol");
		
		//prompt for the user input
		System.out.println("how old are you?");
		
		//search for the next integer that the user enters
		int age = keyboard.nextInt();
		//print the results...
		System.out.println( + age + " wow that's old!");
		
		//prompt for user input
		System.out.println("what do you do for fun?");
		
		//search for the next integer that the user enters
		String fun = keyboard.next();
		//print the results...
		System.out.println( fun + " is pretty boring");
		
		//prompt for user input
		System.out.println("what kind of music do you like?");
		
		//search for the next integer that the user enters
		String music = keyboard.next();
		//print the results...
		System.out.println("wow " + music + " is so mainstream" );
		
		//prompt for user input
		System.out.println("how many siblings do you have?");
		
		//search for the next integer that the user enters
		int siblings = keyboard.nextInt();
		//print the results...
		System.out.println( siblings + "? well I hope they're cooler than you");
		
		//prompt for user input
		System.out.println("what do you want to be when you grow up?");
		
		//search for the next integer that the user enters
		String job = keyboard.next();
		//print the results...
		System.out.println("a " + job + " huh? typical.");
	}
}