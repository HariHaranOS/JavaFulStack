package conditionaloperators;

public class Whileloopex4 {

	
		        int n = 4; // Number of rows and columns
		        int row = 1;
		        int sum = 0;

		        while (row <= n) {
		            int col = 1;

		            while (col <= n) {
		                int number = row * col;
		                System.out.print(number + " ");
		                sum += number;
		                col++;
		            }

		            System.out.println();
		            row++;
		        }

		        System.out.println("Sum of numbers in the pattern: " + sum);
		    }
		

	

}
