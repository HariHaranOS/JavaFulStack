package conditionaloperators;

public class nestedexample1
{
	public static void main(String[]args) 
	{
		int x=10;
		int y=5;
		
		if(x>y) 
		{
			System.out.println("x is greater than y.");
			
		if(x>15) 
		{
			System.out.println("15 is greater than x");
		}
		
		else 
		{
			System.out.println("x is not greater than 15.");
			
		}
		}
		else 
		{
			System.out.println("x is not greater than y.");
		}
	}
	
	

}
