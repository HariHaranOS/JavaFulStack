package literalnotation;

public class Arrayex {

	public static void main(String[] args) {
		String str="Hello,world";
		
		int length=str.length();
		System.out.println("Length of the string:"+length);
		
		String substring=str.substring(3);
		System.out.println("Substring of index 3:"+substring);
		
		String name1="Hello,";
		String name2="alexa";
		String concatenation=name1.concat(name2);
		System.out.println("Concatenation value:"+concatenation);
		
		char charAtIndex=str.charAt(1);  //'e'
		System.out.println("character at index 1:"+charAtIndex);
		
		int indexOfO=str.indexOf('r'); //8
		int indexOfD=str.indexOf('d'); //11
		System.out.println("Index of 'O':"+indexOfO);
		System.out.println("Index of 'D':"+indexOfD);
		
		boolean containsWorld=str.contains("Hello");
		System.out.println("contains 'Hello':"+containsWorld);
		
		String replaced=str.replace("world","java");
		System.out.println("Replaced text:"+replaced);
		
		String uppercase=str.toUpperCase();
		String lowercase=str.toLowerCase();
		System.out.println("Uppercase:"+uppercase);
		System.out.println("Lowercase:"+lowercase);
		
		String withWhitespace="   Trim me!   ";
		String trimmed=withWhitespace.trim();
		System.out.println("Orginal:"+withWhitespace+" ' ");
		System.out.println("Trimmed:"+trimmed+" ' ");
		
	}
	
	
}
