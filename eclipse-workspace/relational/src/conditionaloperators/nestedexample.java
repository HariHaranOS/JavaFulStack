package conditionaloperators;

public class nestedexample {

	public static void main(String[] args) {
		int score=80;
		int passedscore=40;
		int highscore=95;
		
		if(score>=40) 
		{
			System.out.println("Congrats!you passed exam.");
		
		if(passedscore>=0) 
		{
			System.out.println("Good!you got high score.");
		}
		
		else 
		{
			System.out.println("Not bad!you get just pass.");
		}
		}
		else 
		{
			System.out.println("you failed your examination.");
		}

	}

}
