package Corejava;
import java.lang.System;
import java.util.Scanner;

public class ClassAndObject {
	 

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num1=Scan.nextInt();
		int num2=Scan.nextInt();
		if(num1==num2) {
			System.out.println("Num1 is equal to Num2");
		}
		else {
			System.out.println("Num1 is not equal to Num2");
		}
		

	}

}
