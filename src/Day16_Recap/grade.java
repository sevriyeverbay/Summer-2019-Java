package Day16_Recap;

import java.util.Scanner;

public class grade {

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to the Grader!");
	   System.out.println("Please enter subject name number 1 and score for this subject"); 
	    String subjectName1= scan.next();
	    Double grade1 = scan.nextDouble();
	    
	    System.out.println("Please enter subject name number 2 and score for this subject");
	     String subjectName2= scan.next();
	    Double grade2 = scan.nextDouble();
	  
	    System.out.println("Please enter subject name number 3 and score for this subject");
	     String subjectName3= scan.next();
	    Double grade3 = scan.nextDouble();
	  
	    System.out.println("Please enter subject name number 4 and score for this subject");
	     String subjectName4= scan.next();
	    Double grade4 = scan.nextDouble();
	  
	    System.out.println("Please enter subject name number 5 and score for this subject");
	     String subjectName5= scan.next();
	    Double grade5 = scan.nextDouble();
	  
	    System.out.println("Summary:" +subjectName1+ "-" +grade1+","+subjectName2+"-"+grade2+","+subjectName3+"-"+grade3+","+subjectName4+"-"+grade4+","+subjectName5+"-"+grade5);
	    
	   double avarage=(grade1+grade2+grade3+grade4+grade5)/5;
	    System.out.println(avarage);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
















}











}
