import java.util.ArrayList;
import java.util.Scanner;
public class ToyStore
{
	public static void main(String[]args)
	{
		ArrayList<Toy> inventory = new ArrayList<Toy>();
		inventory.add(new Car("hotwheel"));
		inventory.add(new Car("pennyracer"));
		inventory.add(new Car("matchbox"));
		inventory.add(new Car("pullback"));
		inventory.add(new AFigure("starwars"));
		inventory.add(new AFigure("G.I.Joe"));
		
		Scanner kb = new Scanner(System.in);
	}
	
	public ToyStore()
	{
		toyList = {};
	}
	
	public ToyStore(String t)
	{
		toyList = t;
	}
	
	public static void loadToys(String ts)
	{
		for(i = 0, i < toys.length, i++)
	}
	
	public static void getThatToy(String nm)
	{
		for(each toy in toyList)
		{
			if(toy == nm)
			{
				return toy;
			}
			else
			{
				return null;
			}
		}
	}
	
	public static void getMostFrequentToy()
	{
		Scanner name = new Scanner(name);
		Scanner max = new Scanner(Integer.MIN_VALUE);
		for(each toy in toyList)
		{
			if(max < toy.length)
				return name;
			if(max = toy.length)
				return name;
			if(max = name)
				return name;
		}
	}
	
	public static void getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(each toy in toylist)
		{
			if(Toy = Car)
			{
				cars += 1;
			}
			if(Toy = AFigure)
			{
				figures += 1;
			}
			
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return toyList;
	}
}