package Stringclassmethod;

import java.nio.charset.Charset;

public class Stringclass {

	public static void main(String[] args) {
		String s="Hariharan";
		String s1="vjay";
		String s2="silambarasan"; 
		String s3="java";
		String s4="coadingisfun";
		String localel="pumotecnovation";
		String localel1="PUMOTECT";
		String str1="hariharanos";
		String str2="hariharnos".replace('h','k');
		String word4="hariharan";
		Boolean out1="Haei".equals("hari");
		Boolean out2="hariharan".equals("hariharan"); 
		Boolean out3="harI".equalsIgnoreCase("hari");
		
		
		System.out.println("String name="+s);                                           //String name 
		System.out.println("String length="+s1.length());                                //String length
		System.out.println("Character at 3rd position="+s.charAt(4));                   //Character position
		System.out.println("Substring="+s.substring(3));                                //Substring of 3rd value
		System.out.println("Substring="+s.substring(2,4));                              //Substring of 2,4 value
		                                       
		System.out.println("concatenate String="+s1.concat(s2));                        //concatenate String
		System.out.println("Return value of S="+s.indexOf("rihar"));                    //intindex0f(String s)
		System.out.println("Specified char value od index ="+s1.indexOf(1));            //indexOf(inch)
		
		System.out.println("Index of share"+s4.indexOf("ingis"));        
		System.out.println("Index of a ="+s4.indexOf("fu",7));          
		System.out.println("trime value of s="+s.trim());                               //trim value
		
		System.out.println("Uppercase String="+ localel.toUpperCase());                 //UpperCase String
		System.out.println("Lowercase String="+ localel1.toLowerCase());                //LowerCase String
		System.out.println("String intern="+s4.intern()+s2.intern());                   //interned String
		
		System.out.println("Original String"+str1);
		System.out.println("Replaced h with K->"+str2);                                 //replace String
		System.out.println("Original String+");
		
		System.out.println("Trime the word "+word4.trim());                             //Trim value
		
		System.out.println("checking equality "+out1);
		System.out.println("checking equality "+out2);                                  //Checking equality in boolean
		System.out.println("checking equality "+out3);
		
		String[]Arrayofstr=str1.split("n",7);
	    for(String a:Arrayofstr)                                                        //Split String
		System.out.println("Split value"+a);
		
		
	}

}
