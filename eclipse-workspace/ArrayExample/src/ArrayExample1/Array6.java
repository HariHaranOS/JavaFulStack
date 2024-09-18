package ArrayExample1;

public class Array6 {

	public static void main(String[] args) {
		String[][] jaggedArray= {{"mango,","apple."},{"potato,","onian,","ladiesFinger."},{"ginger,","pepper."}};
		for(int i=0;i<jaggedArray.length;i++) 
		{
			for(int j=0;j<jaggedArray[i].length;j++) 
			{
				System.out.print(jaggedArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
