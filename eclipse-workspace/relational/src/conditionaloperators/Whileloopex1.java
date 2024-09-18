package conditionaloperators;

public class Whileloopex1 {                      //OddPatternSum

	public static void main(String[] args) {
		int n=10;
		int row=1;
		int sum=0;
		while(row<=n) 
		{
			int columns=1;
			while(columns<=row) 
			{
				int number=2*columns-1;
				System.out.print(number+" ");
				sum=sum+number;
				columns++;
			}
			System.out.println();
			row++;
		}
		System.out.println("Sum of odd numberd in pattern:"+sum);
		
		
	}

}
