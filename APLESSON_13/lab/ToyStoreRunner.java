import java.util.Scanner;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String toysList = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("enter in the list of toys: ");
		toysList = kb.nextLine();
		
		ToyStore toy = new ToyStore(toysList);
		System.out.println(toy);
		System.out.println("Most Frequent Toy: " + toy.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toy.getMostFrequentType());
	}
}