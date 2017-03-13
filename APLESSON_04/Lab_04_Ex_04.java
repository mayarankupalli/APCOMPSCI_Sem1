import java.util.Scanner;

public class Lab_04_Ex_04
{
	public static void main(String[]args)
	{
		Lab_04_Ex_04 subwoofer = new Lab_04_Ex_04();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the height");
		double h = kb.nextDouble();
		
		System.out.println("enter the length");
		double l = kb.nextDouble();
		
		System.out.println("enter the width");
		double w = kb.nextDouble();
		
		System.out.printf("the volume of your subwoofer box is %10.3f\n", subwoofer.volume(h, l, w));
	}
	
	public double volume(double h, double l, double w)
	{
		return (l*w*h)/1728;
	}
}