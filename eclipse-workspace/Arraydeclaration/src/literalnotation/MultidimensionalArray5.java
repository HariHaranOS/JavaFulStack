package literalnotation;

public class MultidimensionalArray5 {

	public static void main(String[] args) {
		
		int [][][] Array={{{1,2},{3,4}},{{5,6},{7,8}}};
		
		for(int i=0;i<Array.length;i++) {
			for(int j=0;j<Array.length;j++)	{
				for( int k=0;k<Array.length;k++) 
				{
					System.out.println("Array["+i+"]["+j+"]["+k+"]="+Array[i][j][k]);
				}
					
				
				
			}
				}
	}

}
