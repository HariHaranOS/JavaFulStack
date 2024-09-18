package conditionaloperators;

public class example11 {

	public static void main(String[] args) {
		double productPrice= 150.0;
		
		if (productPrice<=50) 
		{
			System.out.println("Low-cost");
			
		}
		else if(productPrice>50&&productPrice<=100) 
		{
			System.out.println("Mid-range");
		}
		else if(productPrice>100&&productPrice<=200) 
		{
			System.out.println("high-range");
		}
		else 
		{
			System.out.println("luxury");
		}

	}

}
