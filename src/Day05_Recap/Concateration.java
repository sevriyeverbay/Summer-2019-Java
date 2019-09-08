package Day05_Recap;

public class Concateration {
/*
 * String: represents the sequences  of characters, used for storing text 
 * String values are surrendered by a double qoute 
 * 
 * Concatenation: combining , linking things together==> .......bak a string value
 * achieved by using  +  operator we can concat any value to string 
 * 
 * 
 */

public static void main(String[] args) {
		
	String str = "any text goes here";
	System.out.println(str);
	
	String str2 = "1";
	System.out.println(str2);
	
	System.out.println("Hello World");
	
	String Hello = "Hello World";
	System.out.println(Hello);
	
	String myName = "Cybertek" + "School";
	System.out.println(myName);
	
	String Year = "This is " + 2019;
	
	// Example: 
			String name = "Sevriye";
			System.out.println("My name is" +name);
			
			/*
			 * Cucumber is 3 $
			 * Tomato is 5 $
			 */

int cucumber = 3;  int tomato = 5;
System.out.println("cucumber is "+'$' +cucumber);    //"cucumber is $3"
System.out.println("Tomato is"+'$'+tomato);          // "tomato is $5"

String newStr ="100"+10;
System.out.println(newStr);  //10010

System.out.println(1+2+3);   //6

System.out.println("1"+2+3);  //"12"+3==>123

//System.out.println("1"+1-3);  //"11"-3

System.out.println("Batch12"+1+2);  //"Batch 121"+2 =>batch1212

System.out.println(2-1+1+"4");  //1+1+"4"=2+"4" => 24

System.out.println( "Batch12" + (1+2));  //"Batch 12+ 3 ==> Batch 123

System.out.println(1+ "123" + 4 + 5);  //"1123"+ 4 + 5==>112345

System.out.println("123"+ (4+5));  //1239

System.out.println(1+ ("1"+2));   //112

System.out.println(1 + "123" + (4+5));  //"1123" + 9 ==> 11239

System.out.println(4 + 3 - (9+3));  //7-12

System.out.println((1+2)+"3");  //33

//System.out.println((1+2-"3"); //3 - "3"

String BookName = "I like the book called \' Game of Throne \'";  
System.out.println(BookName);


String MyInfo = "My Name is:\n\tCybertek";
System.out.println(MyInfo);

System.out.println('3' + 3);  //51 + 3==>54
System.out.println("3" + 3);  //33
System.out.println("3" + '3'); // "3" + 3

// if we concat char to String, char is concated as character // "3 + 3
System.out.println(12 + '3');   //12+51=63

// if we concat char to number, representive number of char will be concated

System.out.println(2+3);//5
System.out.println("2"+3);

System.out.println('7'+ 3); //55+3
System.out.println('7'+9);   //55+9                 


}



}
