package classndobject1;

public class Computer {
	String name;
	int Quantity;
	float size;
	public void display() 
	{
		System.out.println(name);
		System.out.println(Quantity);
		System.out.println(size);
	}
	public static void main(String []args) 
	{
		Computer com=new Computer();
		com.name="Dell";
		com.Quantity=3;
		com.size=15;
		com.display();
	}
	
}