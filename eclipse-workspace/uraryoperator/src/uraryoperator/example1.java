package uraryoperator;

public class example1 {

	public static void main(String[] args) {
		int a=10;
		int b=2;
	
		int c=a+=b;
		int d=a-=b;
		int e=a*=b;
		int f=a/=b;
		int g=a&=b;
		 
		System.out.println("add:"+c);
		System.out.println("sub:"+d);
		System.out.println("mul:"+e);
		System.out.println("div:"+f);
		System.out.println("mod:"+g);	
	}

}
