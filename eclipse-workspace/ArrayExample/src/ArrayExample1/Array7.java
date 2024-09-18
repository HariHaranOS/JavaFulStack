package ArrayExample1;

public class Array7 {

	public static void main(String[] args) {
		String[][][]ThreeDimArray= {{{"Apple","orange"},{"banana","jackfruit"}},
				{{"potato","ladiesFinger"},{"bringal","Spicy"}}};
		for(int i=0;i<ThreeDimArray.length;i++) 
		{
			for(int j=0;j<ThreeDimArray[i].length;j++) 
			{
			for(int k=0;k<ThreeDimArray[i][j].length;k++) 
			{
				System.out.print(ThreeDimArray[i][j][k]+" ");
			}
			System.out.println();
			}
		}
		}
			
		}


