package literalnotation;

import java.util.Arrays;

public class Arrayexample6 {

	public static void main(String[] args) 
	{
		int[]numbers= {45,56,67,78,89};
		Arrays.sort(numbers);
	    System.out.println("Sorted array:");
	    for(int num: numbers) 
	    {
	    	System.out.println(num+"");
	    }
		
		
	}

}
