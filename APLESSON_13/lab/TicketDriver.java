public  class TicketDriver
{
	public static void main (String[]args)
	{
		Walkup object = new Walkup();
		Advance object1 = new Advance(11);
		StudentAdvance object2 = new StudentAdvance(12);
		
		System.out.println(object);
		System.out.println(object1);
		System.out.println(object2);
		
	}
}