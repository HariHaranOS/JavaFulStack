package LogicalOpr;
import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
//		int n=18;
//		if(n%2==1) {
//			System.out.println("n is even number");
//		}
//		else {
//			System.out.println("n is odd number");
//		}
		
		
		Scanner vote=new Scanner(System.in);
		int age=vote.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eglible to vote");
		}
	}

}
