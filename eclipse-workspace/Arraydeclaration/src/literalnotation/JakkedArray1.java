package literalnotation;

public class JakkedArray1 {

	public static void main(String[] args) {
		int[][]Array=new int[2][];
		Array [0]=new int[5];
		Array [1]=new int[5];
	    int count=0;
		for(int i=0;i<Array.length;i++)
		for(int j=0;j<Array[i].length;j++)
			Array[i][j]=count++;
		
		System.out.println("2D Jagged Array:");
		for(int i=0;i<Array.length;i++) 
		{
			for(int j=0;j<Array[i].length;j++) 
			
			System.out.print(Array[i][j]+" ");
			System.out.println();
			
			}
		}
		 
		
	}


