import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter paint color");
		String paint = kb.nextLine();
		System.out.println("enter interior color");
		String interior = kb.nextLine();
		System.out.println("enter engine");
		String engine = kb.nextLine();
		System.out.println("enter tires");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready.......");
		System.out.println("Paint:        " + paint);
		System.out.println("Interior:        " + interior);
		System.out.println("Engine:        " + engine);
		System.out.println("Tires:        " + tires);
		
		object.setpaint(paint);
		object.setinterior(interior);
		object.setengine(engine);
		object.settires(tires);
		
		
		
	}
}