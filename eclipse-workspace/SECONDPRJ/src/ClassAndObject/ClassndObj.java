package ClassAndObject;

public class ClassndObj {
	String name="";
	String proc="";
	int ram=0;
	int price=0;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassndObj lap1=new ClassndObj();
		lap1.name="dell";
		lap1.proc="i3";
		lap1.ram=8;
		lap1.price=4000;
		
		
		ClassndObj lap2=new ClassndObj();
		lap2.name="Lenova";
		lap2.proc="i5";
		lap2.ram=6;
		lap2.price=100000;
		System.out.println("The laptop1: "+"name: "+lap1.name+", procs: "+lap1.proc +",Ram: "+lap1.ram+",Price: "+lap1.price);

	}

}
