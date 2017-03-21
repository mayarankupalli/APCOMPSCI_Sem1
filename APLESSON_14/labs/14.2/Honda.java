public class Honda extends Car 
{
    private double xco;
	private double yco;
	
    public Honda(double[] pos) 
	{
        super();
        move(pos[0], pos[1]);
    }
}