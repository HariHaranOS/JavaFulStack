package ArrayExample1;

public class Array2 
{

	public static void main(String[] args) 
	{
		int []number=new int[] {50,70,65,78,89};
		int sum=0;
		for(int i=0;i<number.length;i++)
			sum=sum+number[i];
		double average=sum/number.length;
		System.out.println("Average value of the Array element is "+average);

	}

}
