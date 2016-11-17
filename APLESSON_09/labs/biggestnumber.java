public class biggestnumber
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray(numbers);
		System.out.println("for the following numbers ");
		printArray(numbers);
		System.out.println(" ");
		System.out.println("The biggest number is: " + getBiggest(numbers));
	}
	
	public static void fillArray(int[] n)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}	
	}
	
	public static void printArray(int[] n)
	{
		for(int num : numbers)
			System.out.print(num + " ");
	}
	
	public static int getBiggest(int[] n)
	{
		int max = 0;
		for(int numbers : n)
		{
			if(numbers > max)
				max = numbers;
		}
		return max;
	}
}