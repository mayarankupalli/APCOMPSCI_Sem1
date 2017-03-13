import java.util.Scanner;
public class GPA_calculator 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("enter your math grade");
		String m = kb.next();
		System.out.println("enter your bio grade");
		String b = kb.next();
		System.out.println("enter your english grade");
		String e = kb.next();
		System.out.println("enter your history grade");
		String h = kb.next();
		System.out.println("enter your chem grade");
		String c = kb.next();
		System.out.println("enter your PE grade");
		String p = kb.next();
		System.out.println("enter your writing grade");
		String w = kb.next();
		
		double gPoints = calcPoints(m) + calcPoints(b) + calcPoints(e) + calcPoints(h) + calcPoints(c) + calcPoints(p) + calcPoints(w);
		double gpa = gPoints/7;
		
		System.out.println("Your GPA is " + gpa);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else 
			return 0;
	}
}