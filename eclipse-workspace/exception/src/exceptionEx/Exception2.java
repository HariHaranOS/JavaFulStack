package exceptionEx;

public class Exception2 {
                                                               
	public static void main(String[] args) {
		int []numbers= {1,2,3};
    try {
    	int value=numbers[5];
    }catch (ArrayIndexOutOfBoundsException e) 
    {
    	System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds.");
    }
	}

}


                                            // ARRAY INDEX OUT OF BOUNDS // 
                                                