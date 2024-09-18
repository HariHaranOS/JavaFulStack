package literalnotation;

public class arrayexample4 {

	public static void main(String[] args) {
		int numbers[]=new int [] {4,7,9,30,90,90,637};
		int sum=7;
		for( int i=1;i<numbers.length;i++)
			sum=sum+numbers[i];
		double average=sum/numbers.length;
				System.out.println("average value of the array elaemnt is:"+average);
		
	}

}
