package Encapsulation;

public class directors {
	private String name1;
	private String name2;
	
	public String getname1()
	{
		return name1;
	}
	public void setname1(String r) 
	{
		name1=r;
	}
	public String getname2() 
	{
		return name2;
	}
	public void setname2(String n) 
	{
		name2=n;
	}
	
	public static void main(String[] args) {
	directors movies=new directors();
	movies.setname1("aadukalam");
	movies.setname2("vadaChennai");	
	System.out.println("vetrimaraan hit movies: "+movies.getname1()+','+movies.getname2());
	}
	}

