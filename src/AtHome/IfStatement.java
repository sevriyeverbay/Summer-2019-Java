package AtHome;

public class IfStatement {
public static void main(String[] args) {
	
	// If Statement

byte PersonAge = 18;
byte VoteAge = 18;
 if (PersonAge >= VoteAge){
        //true
System.out.println("\n\n\n Yes you are eligible to vote");
System.out.println("have fun with building the wall");
System.out.println("MAGA");

 }

if(PersonAge < VoteAge) {
	//false
	System.out.println("You are not eligible to vote yet, please grow up."); // false
}

boolean A = 128 > '9' || 128 ==127;
           //true ||     false ==> true
System.out.println(A); // boolean oldugu icin true veya false  ifadesi verecek A degil.

 
             // If & else
if ( 9 <= 8) {
    //false
System.out.println("9 is less or equal to 8");
}
else {
System.out.println("9 is great than 8");
}

int score = 59;
if (score >= 60) {
	System.out.println("passed");
}                                      // printed: failed because first condition is false//
else {
	System.out.println("failed");
}


           // Multi Branch If Statement
  //IN IF STATEMENT ONLY ONE OF THE BLOCKS GETS EXECUTED.
 
if (false) {
System.out.println("if block");
}
else if(false) {
System.out.println("else if block");       //printed: "if block" because first condition is true//
}                                          //printed:  "else block" because  if conditions are false, printed else.
else {
System.out.println("else block");
}

/*
90 <= grade <= 100==>A
80 <= grade <  90==> B
70 <= grade <  80==> C
60 <= grade <  70==> D
else ==>             F
*/

int grade = 63;
if (grade >=90 && grade <=100) {
	System.out.println("You made A, Great Job.");
}
else if(grade <90 && grade >= 70){
	System.out.println("You made B, Good.");
}                                                         // int grade = ne deger verirsen onu print eder.
else if(grade < 80 && grade >= 70) {
	System.out.println("you made C, That's okey." );
}
else if(grade < 70 && grade >= 60) {
	System.out.println("You made D, Really.");
}
else {
	System.out.println("You made F, Study More.");
}




}}
