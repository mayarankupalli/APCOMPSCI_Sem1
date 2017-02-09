public abstract class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String p)
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
	
	public String systemInput()
	{
		return "Keyboard and Mouse"
	}
	
	public String toString()
	{
		return "Platform: " + platform + "\nSerail #: " + serialNo + "\nSystemInput: " + devices;
	}
}