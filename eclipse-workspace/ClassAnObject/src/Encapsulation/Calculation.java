package Encapsulation;

public class Calculation {
	private String name;
	private int mobileNumber;
	private int adharno;
	private String Address;
	public String getname() 
	{
		return name;
	}
	public void setname(String h) 
	{
		name=h;
	}
	public int getmobileNumber() 
	{
		return mobileNumber;
	}
	public void setmobileNumber(int a) 
	{
		mobileNumber=a;
	}
	public int getadharno() 
	{
		return adharno;
	}
	public void setadharno(int r) 
	{
		adharno=r;
	}
	public String getAddress() 
	{
		return Address;
	}
	public void setAddress(String i) 
	{
		Address=i;
	}
	public static void main(String []args) 
	{
		Calculation cl=new Calculation();
		cl.setname("HariHaran");
		cl.setadharno(10090024);
		cl.setmobileNumber(938323892);
		cl.setAddress("oldperugalatur,thambaran");
		System.out.println("client name: "+cl.getname()+'\n'+"client Adharno: "
		+cl.getadharno()+'\n'+"client mobileNumber: "
		+cl.getmobileNumber()+'\n'+"client Address: "+cl.getAddress());
	}
}