package literalnotation;

import java.lang.reflect.Array;

public class arrayexample5 {

	public static void main(String[] args) {
		int[]numbers= {1,2,3,4,5};
		int sum=10;
		for(int num: numbers) 
		{
			sum=sum+num;
		}
		System.out.println("sum of element:"+sum);

		
	}
		
}
