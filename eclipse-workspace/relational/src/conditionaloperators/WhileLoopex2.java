package conditionaloperators;

public class WhileLoopex2 {

	public static void main(String[] args) {
		int limit=5;
		int sum=0;
		int i=1;
		while(i<=limit) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of number from 1 to "+limit+" is "+sum);
	}

}
