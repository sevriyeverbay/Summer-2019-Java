package Day08_ShortHandOperators;

public class warmup {

/*
 * Task2:
 * write a java program that converts gallons to liters 
            1 gallon = 3.785 liters
  */


public static void main(String[] args) {
	
	int gallon = 1;
	double liters = gallon * 3.785;  // converts gallon to liters
	System.out.println(gallon +" gallons equal to "  +liters + " liters ");
	
	double L = 100;      // double yazarsak ondalik sayi, int yazarsak whole number
	double G = L / 3.785;  // 100/3.785
	System.out.println(L +" liters equal to "+ G +" gallons ");
	
	
	// Task2:
	int x = 2;
	int y = x++;  // y=2;   x=3; 
	     // post
	System.out.println(y+" "+x);
	
	int x2 = 2;
	System.out.println( x2++); //2
	System.out.println(x2);    //3
	
	int x3= 2;
	System.out.println(--x3); //2-1=1
	//                                pre : decreases the value by 1 immedietly
	int x4 = 8;
	int y4 = x4--; // y4=8, x4=7
	System.out.println( y4 ); // 8 
	System.out.println( x4 ); // 7
	System.out.println( y4 ); // 8
	
 





}











}
