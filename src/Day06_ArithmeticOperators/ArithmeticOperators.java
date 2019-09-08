package Day06_ArithmeticOperators;

public class ArithmeticOperators {

/*
 * +: addition,adds two numbers together
 * 
 * -: subtraction, subtracts a number from another number
 * *: multiplication, multiples
 * /: devision, devides
 * 
 * %: remainder, returns 
 
 */

public static void main(String[] args) {
	int a = 100;
	int b = -400;  //-300;
	System.out.println( b );
	
	int c = a+b; // 100+ -300 = -200
	System.out.println(c);
	
	
	int X = 3, Y =  5, Z = X* Y;
	System.out.println(Z); //15
	
	double lenght = 100,
		   Wedith = 10,
		   Area = lenght/Wedith;
	System.out.println( Area );
	System.out.println( 3 + 5 + 4 - 2 );  //10
	//					8 + 4 -2=10
								
	//double resultNum = 9/ 0 ;  // denominator cannot be zero
	//System.out.println(resultNum);
	
	double Number1 = 10/3; //3.333
	double Number2 = 10/3; //3.0
	System.out.println(Number1);
	
	int output = 12 + 6 / 3 ;
	//          18 / 3 = 6
	//          12 + 2 = 14
	System.out.println( output );
	
	System.out.println(5 + 2 * 4);//13
	System.out.println(5 +4 * 2);//13
	System.out.println(10 / 2 - 3);//2
	System.out.println(8 + 12 * 2);//32
	
	
	// % : 
	  /*
	   10/3===> 3 with remainder of 1
	   12/5===> 2 with remainder  ( 12 - (5*2) ) = 2 
	    
	   */
	
int result1 = 10%3; // 1

System.out.println( result1 );							 								
								
System.out.println( 12%5 );	//2

/*
 * 20, 45, 67, 68
 * even: can be divided by 2 without a remainde
 * odd: divided by 2 will have a remainder
 */
 

int Number20 = 20 % 2; //even
int Number45 = 45 % 2; //odd
int Number65 = 65 % 2; //odd

 System.out.println(4 + 17 % 2 - 1); //4
//					4 + 1 - 1 = 4			
								
								
 System.out.println(6 - 3*2 + 7- 1);	//6	


 System.out.println(3 + 4 * 4 + 5 *(4+3));
//                  3 + 4*4 +5*7
//                  3+ 16    +35
//                  54
//10/4===>2 with remainder of (10-

System.out.println( 10 % 4);

System.out.println((4 +17) % 2 - 1);
//                  21 % 2 - 1
}








}
