package LogicalOpr;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner Movie=new Scanner(System.in);
		int age=Movie.nextInt();
		String Loki=Movie.nextLine();
		if(age>28) {
			if(Loki.equals("Loki") ){
				System.out.println("Movie Director");
			}
		
		}

	}

}
