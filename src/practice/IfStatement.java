package practice;

public class IfStatement {
public static void main(String[] args) {
	

/*
declare an int variable called Age
declare a boolean variable "Good Person"
if good person is false;
age>=18==>cigra
age>=21==>Hookah
age>=25==>alcohol

age<13==>milk

else 
//bad for your health
age is 23.

*/
int age = 30;
boolean Goodperson =false;    //true:you can buy milk,Alcohol is bad for your health.//false:you can buy milk,you can buy cigra,
                                                                                             //you can buy Hookah
if(age>18) {
	System.out.println("you can buy milk");
	
if(Goodperson) {
System.out.println("Alcohol is bad for your health");
}
else {
System.out.println("you can buy cigra");
if(age>=21) {
System.out.println("you can buy Hookah");
}
else if (age>=25) {
}
}
}else {// age is <18
	System.out.println("buy milk");
}


/*
 1. write a program that can find the number of days in a month (assume that Feb 28 days)
 
 int month=0~12
 
 1    2    3     4     5    6     7    8    9    10   11   12
jan, feb, mar, april, may, jun, july, aug, sep, oct, nov, dec, 
 31   28   31    30    31   30   31     31  30    31  30   31

 
 most use nested if
 
 28 days:2
 30 days:4,6,9,11
 31 days:1,3,5,7,8,10,12
 
 
 even number of 30 days:4,8,6
 odd number of 30 days:9&11
 
 even number of 31 days:8,10,12
 odd number of 31 days:1,3,5,7
 */

int month = 2;
if(month>0&&month<13) {
	if(month==1) {
	System.out.println("31 days");
	} else if (month==2){
	System.out.println("28 days");
	}else if(month==3) {
	System.out.println("31 days");
	}else if(month==4) {
	System.out.println("30 days");
	}else if(month==5) {
	System.out.println("31 days");
	}else if(month==6) {
	System.out.println("30 days");
	}else if(month==7) {
	System.out.println("31 days");
	}else if(month==8) {
	System.out.println("31 days");
	}else if(month==9) {
	System.out.println("30 days");
	}else if(month==10) {
	System.out.println("31 days");
	}else if(month==11) {
	System.out.println("30 days");
	}else if(month==12) {
	System.out.println("31 days");
	
	}}}}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

