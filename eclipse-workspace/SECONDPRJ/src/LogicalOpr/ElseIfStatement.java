package LogicalOpr;
import java.util.Scanner;
public class ElseIfStatement {

	public static void main(String[] args) {
		Scanner grade=new Scanner(System.in);
		int a=grade.nextInt();
		if(a<50) {
			System.out.println("You are fail");
		}
		else if((a>=50 && a<=60)){
			System.out.println("you are d grade");
		}
		else if((a>=60 && a<=70)) {
			System.out.println("you are c grade");
		}
		else if ((a<=70 && a>=80)) {
			System.out.println("you are b grade");
		}
		else if((a<=80 && a>=90)) {
			System.out.println("you are a grade");
		}
		else if((a>=90 && a<=100)) {
			System.out.println("Congrats! You are the outstanding Students");
		}
		else {
			System.out.println("Invalid Grade");
		}

	}

}
