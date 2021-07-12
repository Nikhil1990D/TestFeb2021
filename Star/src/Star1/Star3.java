package Star1;

public class Star3 
{
	public static void main(String[] args) 
	{
		int row=5 ;
		for (int a=1; a<=row; a++)
		{
		
			for (int b=a; b<=(row-1) ; b++)
			{
				System.out.print(" ");
			}
			for (int c=1; c<=a; c++)
			{	
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
