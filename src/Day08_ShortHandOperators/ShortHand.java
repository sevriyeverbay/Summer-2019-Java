package Day08_ShortHandOperators;

public class ShortHand {

/*
 
 +=: addition assignment             x+=y ==> x+y
 -=: subtraction assignment          x-=y ==> x=x-y
 *=: Multiplication assignment       x*=y ==> x=x*y
 /=: division assignment             x/=y ==> x=x/y
 %=: remainder assignment            x%=y ==> x=x%y
 
*/
public static void main(String[] args) {
// +=:
	int a=9;
	// a= a+3;  // 12
	a += 3;  // a = a+3
	System.out.println(a);
	
	int b = a +=5 ; // a=17
	   //      12 += 5 ==> 12+5 =17
	System.out.println(b);
	// a=17, b=17
	
	int c = a += b;  // a= 34, c=34, b=17
	//      17 +=17  =34
    System.out.println(c);

int d =a += c; //  a=68, d=68, c=34 b=17
      //34+=34
System.out.println(d);

int e = (d+=b) * 2;
//     (68+17) * 2
//      85*2 = 170
System.out.println(e); // d = 85, b=17, e=170, c=34
System.out.println(d);//85
System.out.println(c);//34
System.out.println(b);//17

// d=85, b=17, e=170, c=34
int f = b += d * 2;
//      b +=170;
//      17 +=170 ==> 187
System.out.println(f);
//b=187

// -=:
 int g = 101;
 int h = g -=1; // g = 100, h= 100
 //      101 -=1==>100
 System.out.println(h);
 
 
 int i = g+=h+5;
 //      100+=100 + 5 ==>205
 System.out.println(i);
 
 int j = h+= g % i;  //h=100, j=100
 //      100 += 205 %  205
 //      100 += 0
 System.out.println(j);
 
 
 int k = j -= h *2 % 5;  // j=100
 //      j-=  200%5
//       100 -= 0
 System.out.println(k);
 
 
 // *=:
 int A = 100;
 A *= 200;  // A = A*200
 System.out.println(A);
 //A = 20000;

 int B = 100;
     B *= 100 / 10;
 //  B *=100 / 10
     System.out.println(B);  // 1000
     
B *= B- 1000;
//B *= (1000 -1000) = 0
System.out.println(B);


//  /=:
 int C = 1000;
     C /= 5;
     System.out.println();




}

}
