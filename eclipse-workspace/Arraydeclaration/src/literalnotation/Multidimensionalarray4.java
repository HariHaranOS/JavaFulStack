package literalnotation;

public class Multidimensionalarray4 {

	public static void main(String[] args) {
		int rows=5;
		int columns=6;
		int [][]Array=new int[rows][columns];
		System.out.println("Enter the rows:"+rows);
		System.out.println("Enter the columns:"+columns);
		System.out.println("The matrix value is:");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) 
			{
				Array[i][j]=(i+1)*(j+1);
				
			}
		}
			for( int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) 
				{
					System.out.print(Array[i][j]+" ");
				}
				System.out.println();
			}
		}
	}


