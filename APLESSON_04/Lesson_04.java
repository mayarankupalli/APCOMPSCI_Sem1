public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "baaah";
		double number1 = 444564.3453;
		form.format(word1, number1);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}