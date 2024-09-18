package User;
import java.lang.System;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		Scanner myobj2=new Scanner(System.in);
		System.out.println("Enter the number a");
		int a=myobj.nextInt();
		System.out.println("The value is int:"+a);
		
		System.out.println("Enter the number b");
		float b=myobj2.nextInt();
		System.out.println("The value is int:"+b);
		
		
		System.out.println("Enter the number d");
		double d=myobj.nextInt();
		System.out.println("The value is int:"+d);
		
		
		System.out.println("Enter the number name");
		String name=myobj.nextLine();
		System.out.println("The value is int:"+name);
		
		

	}

}
