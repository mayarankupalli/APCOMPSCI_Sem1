public class XsandOs
{
	public static void main(String[]args)
	{
		String[][]xandO = new String [4][4];
		
		for(int i = 0; i < xandO.length; i++)
		{
			for(int j = 0; j < xandO[i].length; j++)
			{
				int pick = (int) (Math.random() * 2 + 1);
				{
					if(pick == 1)
					{
						xandO[i][j] = "x";
					}
					else
					{
						xandO[i][j] = "o";
					}
					System.out.print(xandO[i][j] + "\t");
					
				}
				
			}
			System.out.println();
		}
		
		
	}
}