public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public String getPlatform()
	{
		super();
	}
	
	public int getSerialNo()
	{
		super();
	}
	
	public abstract String getController()
	
	public String toString()
	{
		return "Platform: " + platform + "\nSerail #: " + serialNo + "\nController: " + controller;
	}
}