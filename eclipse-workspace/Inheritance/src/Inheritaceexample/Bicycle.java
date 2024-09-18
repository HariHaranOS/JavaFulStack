package Inheritaceexample;

public class Bicycle {

	private int gear;
	private int speed;
	protected String name;
	protected String country;
	public int getgear() 
	{
		return gear;
	}
	public void setgear(int r) 
	{
		gear=r;
	}
	public int getspeed() 
	{
		return speed;
	}
	public void setspeed(int n) 
	{
		speed=n;
	}
}
 class BicycleName extends Bicycle
{
	public String getname() 
	{
		return name;
	}
	public void setname(String v) 
	{
		name=v;
	}
	public String getcountry() 
	{
		return country;
	}
	public void setcountry(String w) 
	{
		country=w;
	}
}
class herculas{ 
 public static void main(String []args) 
 {
	 BicycleName cl=new BicycleName();
	 cl.setcountry("india");
	 cl.setname("Hari");
	 cl.setgear(6);
	 System.out.println(cl.getname()+cl.getcountry()+cl.getgear());
	 
 }
 }	 
 