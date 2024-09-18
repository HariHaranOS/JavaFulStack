package conditionaloperators;

public class nestedexample2 {

	public static void main(String[] args) {
		
		int age=18;
		boolean isStudent=true;
		
		if(age<=18) 
		{
			System.out.println("Child ticket: $30.");
		}
		else if(age>12 && age<19)
		{
		if(isStudent) 
		{
			System.out.println("Student ticket: $45.");
		}
		else 
		{
			System.out.println("Teen ticket: $60.");
		}
		
		}
		else 
		{
			System.out.println("Adult ticket: $75.");
		}
	}

}
