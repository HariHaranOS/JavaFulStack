package conditionaloperators;

public class example12 {

	public static void main(String[] args) {
		int hour=15;
		if (hour>=0&&hour<12) 
		{	
			System.out.println("Good morning!");
		}
		else if(hour>=12&&hour<18) 
		{
			System.out.println("Good afternoon!");
		}
		else 
		{
			System.out.println("Good evening!");
		}
	}

}
