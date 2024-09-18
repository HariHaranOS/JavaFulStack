package ArrayExample1;

public class Array1 
{

	public static void main(String[] args) 
	{
		int my_Array[]= {1,2,3,4,5};
		int sum=0;
		for(int i:my_Array)
			sum=sum+i;
		System.out.println("The sum of value "+sum);
		
	}

}
