import java.util.Scanner;
public class gamegun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip;
	
	public static void main(String[]args)
	{
		int bulletCount = 96;
		int shotCount = 0;
		String[]clip = new String[CLIPSIZE]; 
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("action");
			String action = kb.next();
			if(action.equals("R"))
			{
				
				reload();
			}
			if(action.equals("S"))
			{
				shoot();
			}
		}
		
		printClip();
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount-=1;
			return "Boom!!!";
		}
		else
		{
			return "reload!!!";
		}
	}
	
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static void printClip()
	{
		String output = " ";
		System.out.println("bullets" + "\t" + bulletCount + "\n" + "clip" + "\t");
		for(int i = 0; i < CLIPSIZE; i++)
		{
			clip[i] = output;
		}
		System.out.println(output);
	}
}