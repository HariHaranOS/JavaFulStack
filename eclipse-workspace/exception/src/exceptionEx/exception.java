package exceptionEx;

public class exception {

	public static void main(String[] args) {
		int i=2;
		int j=0;
		int num[]=new int [5];
		try 
		{
			j=18/i;
			System.out.println(num[1]);
			System.out.println(num[5]);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("cannot divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Stay the limit in Array format");
		}
		catch(Exception e) 
		{
			System.out.println("Exception occured");
		}
	}

}
