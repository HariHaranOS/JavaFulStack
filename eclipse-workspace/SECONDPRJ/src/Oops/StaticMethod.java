package Oops;

public class StaticMethod {
	static void MystaticMethod() {
		System.out.println("Static method");
	}
	public void MypublicMethod() {
		System.out.println("Public Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MystaticMethod();
		StaticMethod obj=new StaticMethod();
		obj.MypublicMethod();
	}

}
