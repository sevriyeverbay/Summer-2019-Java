package Day04_Variables;

public class WarmupTask {
/*
 1. Cucumber		=>2.5$
 2. Onion			=>1.5$
 3. Green Pepper	=>2$
 4. Tomato			=>3&
 5. Carrots			=>4$
 */

	public static void main(String[] args) {
	//Cucumber:
	//int Cucumber = 2.5; we can only assign whole numbers to int, byte, short,
	
	// float Cucumber = 2.5;	//float cannot contain double
	float Cucumber = 2.5f;
	double Cucumber2 = 2.5f;  // double can contain float
	double Cucumber3 = 2.5;

	//Onion; 1.5
	//float Onion = 1.5f;
	//double Onion = 1.5;

	//Green Pepper: 2$
	byte  GreenPepper = 2;
	short GreenPepper2 = 2; 
	int GreenPepper3 = 2;
	long GreenPepper4 = 2l;
	float GreenPepper5 = 2;	//only time we add f or F is, when are assigning decimals
	double GreenPepper6 = 2;
	
	System.out.println(GreenPepper);
	System.out.println(GreenPepper2);
	System.out.println(GreenPepper3);
	System.out.println(GreenPepper4);
	System.out.println(GreenPepper5);	// double float converts the whole numbers to decimal
	System.out.println(GreenPepper6);
	
	}




}
