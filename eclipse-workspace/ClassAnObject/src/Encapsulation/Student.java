package Encapsulation;

public class Student
{
	public  static void School () 
	{
		System.out.println("School percentage=90%-95%");
	}

	public static void student1() {
		
		
	}

	public static void student2() {
		// TODO Auto-generated method stub
		
	}
}
     class highsec
    {
    	public  static void highersecandary() 
    	{
    		System.out.println("In the classes of 12th=80%-85%");
    	}
    }
     class college
     {
    
    	public static void University() 
    	{
    		System.out.println("In college=70%-75%");
    	}
    
    	
     }

 class main{
    public  static void main (String[]args) 
    {
    	Student stu=new Student();
    	highsec his=new highsec();
    	college clg=new college();
    	stu.School();
    	
    	highsec.highersecandary();
    	college.University();
    }	
    }
 
