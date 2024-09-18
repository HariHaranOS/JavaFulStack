package ArrayExample1;

public class Array3 {

	public static void main(String[] args) {
		
		int[]number= {2,3,4,5,6};
		int sum=0;
		for(int i=0;i<number.length;i++) 
		{
			sum+=number[i];
		}
		System.out.println("Sum of array: "+sum);
	}
}