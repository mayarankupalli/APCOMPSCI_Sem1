import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter hair color");
		String hair = kb.nextLine();
		System.out.println("enter eyes color");
		String eyes = kb.nextLine();
		System.out.println("enter skin color");
		String skin = kb.nextLine();
		
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("Friend's info.......");
		System.out.println("hair: " + hair);
		System.out.println("eyes: " + eyes);
		System.out.println("skin: " + skin);
		
		
		object.sethair(hair);
		object.seteyes(eyes);
		object.setskin(skin);
		
		
		
		
	}
}