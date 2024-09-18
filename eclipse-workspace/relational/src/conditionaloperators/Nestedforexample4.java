package conditionaloperators;

public class Nestedforexample4 {

	public static void main(String[]args) {
		
		
		int rows=9;
		int num=9;
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=rows-i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
