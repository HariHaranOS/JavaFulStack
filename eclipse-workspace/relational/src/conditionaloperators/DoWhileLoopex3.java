package conditionaloperators;

public class DoWhileLoopex3 {

	public static void main(String[] args) {
		int start=10;
		int end=1;
		System.out.println("Counting from "+start+" to "+end);
		do {
			System.out.println(start);
			start--;
			
		}while(start>=end);
	}

}
