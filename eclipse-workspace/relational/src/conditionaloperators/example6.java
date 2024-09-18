package conditionaloperators;

public class example6 {

	public static void main(String[] args) {
		int score=95;
		if(score>=90) 
		{
			System.out.println("your grade is A.");
			
		}
		else if(score>=80) 
		{
			System.out.println("your grade is B.");
			
		}
		else if(score>=70) 
		{
			System.out.println("your grade is C.");
			
		}
		else if(score>=60) 
		{
			System.out.println("your grade is D.");
		}
		else 
		{
			System.out.println("your grade is E.");
		}
	}

}
