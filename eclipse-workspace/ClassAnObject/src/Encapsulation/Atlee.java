package Encapsulation;

public class Atlee {
	private String name1;
	private String name2;
	private String name3;
	public String getname1() 
	{
		return name1;
	}
	public void setname1(String x) 
	{
		name1=x;
	}
	public String getname2() 
	{
		return name2;
	}
	public void setname2(String y) 
	{
		name2=y;
	}
	public String getname3() 
	{
		return name3;
	}
	public void setname3(String z) 
	{
		name3=z;
	}

	public static void main(String[] args) {
		
		Atlee Three=new Atlee();
		Three.setname1("Theri");
		Three.setname2("Mersal");
		Three.setname3("Bigil");
		System.out.println("Atlee vijay combo movies:");
		System.out.println("first movie: "+Three.getname1()+"(hit),"+'\n'+"Second movie: "+Three.getname2()+"(blockbuster),"+'\n'+
				"Third movie: "+Three.getname3()+"(mega blockbuster).");
	}

}
