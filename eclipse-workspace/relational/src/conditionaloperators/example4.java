package conditionaloperators;

public class example4 {

	public static void main(String[] args) {
		int a=44;
		
		if(a%2==0) 
		{
			System.out.println("even numbers:"+a);
		}
		else if(a%3==0) 
		{
			System.out.println("add numbers:"+a);
		}
		else 
		{
			System.out.println("invalid character"+a);
		}
	}

}
