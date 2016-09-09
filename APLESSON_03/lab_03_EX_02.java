import java.util.Scanner; //import Statement 

public class lab_03_EX_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("what is your weight?");
		Double weight = keyboard.nextDouble();
		System.out.println("what is your height?");
		Double height = keyboard.nextDouble();
		
		Double BMI = 703*(weight/(height*height));
		System.out.println("your BMI is " + BMI);
		
	}
}