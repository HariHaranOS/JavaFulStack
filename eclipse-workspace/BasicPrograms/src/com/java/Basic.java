
package com.java;
import java.lang.System;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		var name=scan.nextLine();
		double score=scan.nextDouble();
		scan.nextLine();
		var department=scan.nextLine();

		
		System.out.println("My name is "+name);
		System.out.println("My score is "+score/10);
		System.out.println("My department is "+department);
		
		

	}

}
