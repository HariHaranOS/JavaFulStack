package conditionaloperators;

public class example5 {

	public static void main(String[] args) {
		int hour=1;
		if(hour>=0&&hour<12) 
		{
			System.out.println("moring");
		}
		else if (hour>=12&&hour<18) 
		{
			System.out.println("afternoon");
		}
		else if(hour>=18&&hour<24) 
		{
			System.out.println("evening");
		}
		else 
		{
			System.out.println("invalid hour");
		}
		
	}

}
