package LokiUniverse;

public class Love {
	

	public void Amar(String name1) 
	{
		System.out.println("Amar loves "+name1);
	}
	public void Vijay(String name2,String name3) 
	{
		System.out.println("Vijay loves "+name2+" but "+name2+" loves surya");
	}

	public static void main(String[] args) {
		Love love=new Love();
		love.Amar("Gayathri");
		love.Vijay("trisha", "Gayathri");
		
	}

}
