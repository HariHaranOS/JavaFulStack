package Switchstatement;

public class example2 {

	public static void main(String[] args) {
		String fruit="apple";
		int price;
		switch (fruit) 
		{
		case "mango":
			price=90;
			System.out.println("mango price:"+price);
			break;
		case "apple":
			price=28;
			System.out.println("apple price:"+price);
			break;
		case "banana":
			price=30;
			System.out.println("banana price:"+price);
			break;
		case "blueberry":
			price=60;
			
			System.out.println("blueberry price:"+price);
		
			
		default:
			System.out.println("invalid fruit name");
		}
		
		
	}

}
