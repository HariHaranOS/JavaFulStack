package Oopsexample1;

class add
{
	void additin()
	{
		int num1=10;
		int num2=20;
		System.out.print(num1 + num2);
	}
}
class multi extends add
{
	void multipli()
	{
		int num1 =2;
		int num2 =3;
		System.out.print(num1+num2);
	}
}
class main{
    public static void main(String[] args)
    {
    	multi x = new multi();
    	x.additin();
    	x.multipli();
    }   	
}



