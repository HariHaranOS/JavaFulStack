package Inheritaceexample;

public class BankAccount {

    public int add(int n1,int n2) 
    {
    	return n1+n2;
    }
    public int sub(int n1,int n2) 
    {
    	return n1-n2;
    }
}
 class AdvanceCalculator extends Calculator
{
	 public int mul(int n1,int n2) 
	 {
		 return n1*n2;
	 }
	 public int div(int n1,int n2) 
	 {
		 return n1/n2;
	 }
}
 class ScientificCalc extends AdvanceCalculator
 {
	 public double doublepower(int n1,int n2) 
	 {
		 return Math.pow(9, 5);
	 }
 }
 class demo{
	public static void main(String[] args) {
		ScientificCalc c=new ScientificCalc();
		int r1=c.mul(9, 8);
		int r2=c.div(8, 1);
		double r3=c.doublepower(7, 9);
		System.out.println("the Addition of two numbers:"+r3);
	}

}
