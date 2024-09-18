package mutliplication;
class add
{
	void addition(int num1,int num2)
	{
	
		System.out.print(num1 + num2);
	}
}
class sub
{
	void subraction(int num1,int num2) 
	{
		System.out.println(num1-num2);
	}
}
class divi
{
	void division(int num1,int num2) 
	{
		System.out.println(num1/num2);
	}
}
class modul
{
	void modulo(int num1,int num2) 
	{
		System.out.println(num1%num2);
	}
}
class multi 
{
	void multipli(int num1,int num2)
	{
		
		System.out.print(num1*num2);
	}
}
public class multiplication{
    public static void main(String[] args)
    {
        add y = new add();
        sub z=new sub();
        divi f=new divi();
    	multi x = new multi();
    	modul g=new modul();
    	
    	System.out.println("multiplication value is:");
    	x.multipli(9,3);
    	System.out.println("\n");
    	
    	System.out.println("addition value is:");
    	y.addition(90,20);
    	System.out.println("\n");
    	
    	System.out.println("subraction value is:");
    	z.subraction(6, 3);
    	System.out.println("\n");
    	
    	System.out.println("division value is:");
    	f.division(7, 14);
    	System.out.println("\n");
    	
    	System.out.println("modulo value is:");
    	g.modulo(8, 8);
    }   	
}