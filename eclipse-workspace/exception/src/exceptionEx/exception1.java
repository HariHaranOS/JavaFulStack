package exceptionEx;

public class exception1 {

	public static void main(String[] args) {
		int numberator=10;
		int denominator=0;
		try 
		{
			int result=numberator/denominator;
		}catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException: Division by zero.");
		}

	}

}
