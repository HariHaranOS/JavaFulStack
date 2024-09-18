package operatorsexample;

public class example1 {

	public static void main(String[] args) {
		int a=30,b=15;
		int sum=a+b;
		int difference=a-b;
		int product=a*b;                                    //arithmetic operators
		int quotient=a/b;
		int remainder=a&b;
		System.out.println("The arithmetic operators:");
		System.out.println("add:"+sum);
		System.out.println("subraction:"+difference);
		System.out.println("multiple:"+product);
		System.out.println("division:"+quotient);
		System.out.println("module:"+remainder);
		System.out.println('\n');
		
		int x=40;
		int y=80;
		System.out.println("The unary operators:");
		System.out.println("The value of X:");
		System.out.println("increment:"+ ++x);
		System.out.println("increment:"+ x++);
		System.out.println("increment:"+ ++x);               
		System.out.println("decrement:"+ --x);
		System.out.println("decrement:"+ x--);               //unary operators
		System.out.println("decrement:"+ --x);
		System.out.println("The value of Y:");
		System.out.println("increment:"+ ++y);
		System.out.println("increment:"+ y++);
		System.out.println("increment:"+ ++y);
		System.out.println("decrement:"+ --y);
		System.out.println("decrement:"+ y--);
		System.out.println("decrement:"+ --y);
		System.out.println('\n');
		
		int num1=20;
		int num2=35;
		sum= num1 += num2;
		difference= num1-=num2;
		product=num1*=num2;
		quotient=num1/=num2;                                 //Assignment operators             
		remainder=num1&=num2;
		System.out.println("The assignment operators:");
		System.out.println("The value of num1="+num1);
		System.out.println("The value of num2="+num2);
		System.out.println("add="+sum);
		System.out.println("subraction="+difference);
		System.out.println("multiple="+product);
		System.out.println("division="+quotient);
		System.out.println("module="+remainder);
		System.out.println('\n');
		
		
		int A=20;
		int B=25;
		int C=20;
		System.out.println("The relational operators:");
		System.out.println("A:"+A);
		System.out.println("B:"+B);
		System.out.println("C:"+C);
		System.out.println("A==B:" +(A==B));                   //relational operators
		System.out.println("A==C:"+(A==C));
		System.out.println("A!=B:"+(A!=B));
		System.out.println("A!=C:"+(A!=C));
		System.out.println('\n');
		
		
		int var1=36,var2=40;
		System.out.println("AND OPERATOR:");
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println((var1>var2)&&(var1==var2));
		System.out.println("OR OPERATOR:");
		System.out.println("var1:"+var1);                      //bitwise operators
		System.out.println("var2:"+var2);
		System.out.println((var1>=var2)||(var1<=var2));
		System.out.println("NOT OPERATOR:");
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println(!(var1>var2));
		System.out.println("EXOR OPERATOR:");
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println(var1^var2);
		System.out.println('\n');
		
		int var3=50,var4=3;
		int leftshiftresult=var3<<var4;
		int rightshiftresult=var3>>var4;                          //left and right shift
		System.out.println("left and right shift:");
		System.out.println("leftshiftresult:"+leftshiftresult);
		System.out.println("rightshiftresult:"+rightshiftresult);
			

	}

}
