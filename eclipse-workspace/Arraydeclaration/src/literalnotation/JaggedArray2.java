package literalnotation;

public class JaggedArray2 {

	public static void main(String[] args) {
		int r=5;
		int Array[][]=new int[r][];
		for(int i=0;i<Array.length;i++)
			Array[i]=new int [i+1];
		int count=0;
		for(int i=0;i<Array.length;i++)
			for(int j=0;j<Array[i].length;j++)
				Array[i][j]=count++;
		System.out.println("2D Jagged Array:");
		for(int i=0;i<Array.length;i++) 
		{
			for(int j=0;j<Array[i].length;j++) 
			{
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
			
		
		
			
	}

}
