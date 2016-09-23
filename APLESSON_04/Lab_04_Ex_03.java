import java.util.Scanner;

public class Lab_04_Ex_03
{
	public static void main(String[]args)
	{
		Lab_04_Ex_03 loan = new Lab_04_Ex_03();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter your interest rate");
		double r = kb.nextDouble();
		
		System.out.println("enter your principal");
		double p = kb.nextDouble();
		
		System.out.println("enter the number of times the loan is compounded per year");
		double n = kb.nextDouble();
		
		System.out.println("enter the life of the loan");
		double t = kb.nextDouble();
		
		System.out.printf("your monthly payment will be $%10.2f\n", loan.payment(r, p, n, t));
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return (p*(Math.pow((1+(r/n)), (n*t))))/(12*t);
	}
	
}