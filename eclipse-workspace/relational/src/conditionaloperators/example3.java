package conditionaloperators;

public class example3 {

	public static void main(String[] args) {
		int year=2000;
		if(year%4!=0) 
		{
			System.out.println("not leap year:"+year);
		}
		else if((year%4==0) ||(year%100==0))
		{
			System.out.println("leap year:"+year);
			System.out.println("century year:"+year);
			
		}
		else 
		{
			System.out.println("it is not leap year and century year");
		}
			
	}
}
