package Oopsexample1;
class add
{
	void addition(int num1,int num2)
	{
	
		System.out.print(num1 + num2);
	}
}
class multi 
{
	void multipli(int num1,int num2)
	{
		
		System.out.print(num1*num2);
	}
}
class main{
    public static void main(String[] args)
    {
        add y = new add();
    	multi x = new multi();
    	x.multipli(2,3);
    	System.out.println("\n");
    	y.addition(10,20);
    }   	
}