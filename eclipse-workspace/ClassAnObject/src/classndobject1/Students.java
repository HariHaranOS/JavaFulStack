package classndobject1;

import Encapsulation.Student;

public class Students {
	String name;
	int age;
	void displayDetails() 
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}


	public static void main(String []args) 
	{
	Students stu=new Students();
	stu.name="Hari";
	stu.age=20;
	stu.displayDetails();
	}
}