package practice;

public class StringManipulation {

public static void main(String[] args) {
	
String str = "The rains have started here";
String str1 = "The rains Have started here";

System.out.println(str.length());  //27
System.out.println(str.charAt(5)); //a
System.out.println(str.indexOf("s")); //8
System.out.println(str.indexOf("s",9));//15
System.out.println(str.indexOf("have"));//10
System.out.println(str.indexOf("hello"));  //-1

// String Comparison:
System.out.println(str.equals(str1));//false
System.out.println(str.equalsIgnoreCase(str1));//true

//Substring:
System.out.println(str.substring(0,9)); //The rains


}

}


