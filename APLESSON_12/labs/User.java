public class User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public User (String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}

	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setavatar(String a)
	{
		avatar = a;
	}	
	
	public String toString()
	{
		return "Customer Info...\nFirstName: " + firstName + 
								"\nLastName: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
		
	}
}