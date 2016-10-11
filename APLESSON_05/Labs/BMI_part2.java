import java.util.Scanner; 

public class BMI_part2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your weight?");
		Double weight = kb.nextDouble();
		System.out.println("what is your height?");
		Double height = kb.nextDouble();
		
		Double BMI = 703*(weight/(height*height));
		String category = "";
		
		if (BMI <= 18.5)
			category = "underweight";
		else if (BMI <= 24.9)
			category = "normal";
		else if (BMI <= 29.9)
			category = "overweight";
		else if (BMI <= 34.9)
			category = "obese";
		else if (BMI <= 39.9)
			category = "very obese";
		else 
			category = "morbidly obese";
		
		System.out.println("your BMI is " + BMI);
		System.out.println("your are " + category);
	}
}