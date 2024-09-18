package Stringclassmethod;

public class Stringclass2 {

	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("Hello");
		stringBuffer.append(",");
		stringBuffer.append("World!");
		
		String result=stringBuffer.toString();
		System.out.println(result);
	}

}
