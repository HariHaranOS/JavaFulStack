package literalnotation;

public class Arrayexample8 {

	public static void main(String[] args) {
	int my_array[]= {1,2,3,4,5,6,7,8};
	int product=2;
	
	for(int i: my_array)
	product  *=i;
	System.out.println("The sum is"+product);
	
		
		
	}

}