package conditionaloperators;

public class DoWhileLoopex2 {

	public static void main(String[] args) {
		int n=5;
		int factorial=1;
		int i=1;
		do {
			factorial=factorial*i;
			i++;
			
		}while(i<=n);
	System.out.println("Factorial of "+n+" is "+factorial);	
	}

}
								//FACTORIAL OF A NUMBER