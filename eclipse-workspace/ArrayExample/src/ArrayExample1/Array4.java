package ArrayExample1;

public class Array4 {

	public static void main(String[] args) {
		int []numbers= {12,5,9,27,6};
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++) 
		{
			if(numbers[i]>max) 
			{
				max=numbers[i];
			}
		}
		System.out.println("maximum value in the array: "+max);
	}

}
