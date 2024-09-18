package conditionaloperators;

public class Nestforloop3 {

	public static void main(int mat[][]) {
		int rows=10;
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=rows-i;j++) 
				System.out.print(" ");
			{
				for(int k=1;k<=2*i-1;k++) 
				{
					System.out.print("k");
				}
				System.out.println();
			}
		}

	
	for(int i=0;i<mat.length;i++) 
	{
		for(int j=0;j<=mat[i].length;j++)
			System.out.print(mat[i][j]+" ");
		
		System.out.println();
	}

}
public static void main(String args[][]) 
{
int mat[][]= {{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}};
print2D(mat);
}

}
}

