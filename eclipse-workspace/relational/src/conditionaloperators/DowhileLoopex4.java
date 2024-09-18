package conditionaloperators;

public class DowhileLoopex4 {

	public static void main(String[] args) {
		int start=2;
		int end=50;
		int number=start;
		do {
			if(isprime(number)) 
			{
			System.out.println(number);	
			}
			number++;
		}while(number<=end);
		
}

	private static boolean isprime(int number) {
		if(number<=1) 
		{
			return false;	
		}
		for(int i=2;i<=Math.sqrt(number);i++) 
		{
			if(number%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	
}