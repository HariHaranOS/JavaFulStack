package LokiUniverse;

public class Calculation {
	public int add(int n1,int n2) 
	{
		return n1+n2;
	}
	public int sub(int n3,int n4) 
	{
		return n3-n4;
	}
	public int multiple(int n5,int n6) 
	{
		return n5*n6;
	}
	public int divison(int n7,int n8) 
	{
		return n7/n8;
	}
	public int modulo(int n9,int n10) 
	{
		return n9%n10;
	}
	

	public static void main(String[] args) {
		Calculation cl=new Calculation();
		int r1=cl.add(3, 9);
		int r2=cl.sub(19,9);
		int r3=cl.multiple(9, 10);
		int r4=cl.divison(10,2);
		int r5=cl.modulo(5, 9);
		System.out.println("Arithmetic Operators");
		System.out.println("Addition: "+r1);
		System.out.println("subraction: "+r2);
		System.out.println("multiplication: "+r3);
		System.out.println("divison: "+r4);
		System.out.println("modulo: "+r5);
	}

}
