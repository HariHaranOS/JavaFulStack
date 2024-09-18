package conditionaloperators;

public class example13 {

	public static void main(String[] args) {
		double distance=75.0;
		
		if(distance<1) 
		{
			System.out.println("walking");
		}
		else if(distance<20) 
		{
			System.out.println("bicycle");
		}
		else if(distance<55) 
		{
			System.out.println("private bus");
		}
		else if(distance<200) 
		{
			System.out.println("car");
		}
		else 
		{
			System.out.println("airplane");
		}
	}

}
