public class Human
{
	private String hair, eyes, skin;
	
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//modifier
	public void sethair(String h)
	{
		hair = h;
	}
	
	public void seteyes(String e)
	{
		eyes = e;
	}
	
	public void setskin(String s)
	{
		skin = s;
	}
	
	//Accessors
	public String gethair()
	{
		return hair;
	}
	
	public String geteyes()
	{
		return eyes;
	}
	
	public String getskin()
	{
		return skin;
	}
	
	
}