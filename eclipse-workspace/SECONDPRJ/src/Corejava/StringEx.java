package Corejava;
import java.util.Scanner;
public class StringEx {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int salary=Scan.nextInt();
		int age=Scan.nextInt();
		
		if(salary>=20000 || age<25) {
			System.out.println("Requied loan amount");
		  int loan=Scan.nextInt();
		  if(loan<50000) {
			  System.out.println("Loan Available");
		  }
		}
		
		else {
			System.out.println("No loan");
		}
		
	}
	
}
