package Day11_ifstatementreview;

public class warmup {
	
	public static void main(String[] args) {
		
		/*
		 declera an int variable  called age
		 declere a boolean variable "GoodPerson"
		 
		  if goodperson is false:
		  
		  age >=18>=cigara
		  age>=21=>hokkah
		  age>=25=>alcohal
		  
		  age<18=>milk
		  else
		  //bad for yor health
		  age is 23.
		  
		 
		 */
		int age=30;
		boolean GoodPerson=false;
		if(age>=18) {
			System.out.println("you can buy milk");
			if(GoodPerson) {
				System.out.println("Alcohol is bad for your health");
			}else { //goodperson=false&& age >=18
				System.out.println("you can buy cigara");
				
				if(age>=21) {
					System.out.println("you can buy Hookah");
				}
				else if(age>=25) {
					System.out.println("you can buy alcohol");
				}
			}
			
		}else {  //age is <18
			System.out.println("buy milk");
		}
		
		/*
		 1.write a program that can find the number of days in a month
		 (assume that Feb has 28 days)
		 
		  int month=0~12;
		           1      2    3     4     5     6    7    8     9    10    11    12
		 		  jan ,  feb, mar, april, may,  jun, july, aug ,sep,  oct,  now,  dec
		          31      28   30  30     31    30   31    31   30    31    30    31
		  
		  must use nested if
		  
		  
		  28 days:2
		  30 days:4,6,9,11
		  31 days:1,3,5,7,8,10,12
		  
		  even number of 30  days:4 & 6
		  odd number of 30 days:9 &11
		  
		  even number of 31 days: 8,10,12
		  odd number of 31 days:1,3,5,7
		  
		  
		
		 */
		
		int month=5;
		if(month>0&&month<13) {
			if (month==1) {
				System.out.println("31 days");
		
			}else if(month==2) {
				System.out.println("28 days");
			}else if(month==3) {
				System.out.println("31 days");
			}else if(month==4) {
				System.out.println("30 days");
			}else if(month%2==1) {
				System.out.println("31 days");
			}else if(month==6) {
				System.out.println("30 days");
			}else if (month==7){
				System.out.println("31 days");
			}else if(month %2 ==0) {
				System.out.println("31 days");
			}else {
				System.out.println("30 days");
				
			}
			
			
			
			
			
		}else {
			System.out.println("invalid entry");
		}
				
		/*
		 28 days:2
		 30 days:4,6,9,11
		 
		 
		 */
		
		int Month2=8;
		if(Month2>0 && Month2<13) {
			
		
		if(Month2==2) {
			System.out.println("28 days");
		}
		else if(Month2==4||  Month2==6) {
			System.out.println("30 days");
			
		}
		else if(Month2==9||Month2==11) {
			System.out.println("30 days");
		}else {
			System.out.println("31 days");
				
			}
		}else {
			System.out.println("invalid entry");
		}
		
		// if-else && else-if:
		 if(true) { //true
			 System.out.println("hello");
		 }
		 else {//false
			 System.out.println("batch 12");
		 }
		 if (true) { //true
			 System.out.println("hello");
		 }else if(false) { //false
			 System.out.println("batch 12");
		 }else { //never gets executed
			 System.out.println("cybertek");
		 }
		 
		 
		 /*
		  if(true) {
		  }
		  else{
		  }
		  else if(false){
		  }
		  
		  */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
