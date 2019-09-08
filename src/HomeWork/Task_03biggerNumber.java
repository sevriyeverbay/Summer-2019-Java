package HomeWork;

public class Task_03biggerNumber {

	public static void main(String[] args) {
	
int n1 = 100, n2 = 500, n3 = 100;
int maximum = 0;

if(n1>n2 && n1>n3) {
	maximum = n1;
}

if(n2>n1 && n2>n3) {
maximum = n2;

}

if(n3>n1 && n3>n2) {
	maximum = n3;
	
}

System.out.println(" Maximum number between " +n1 + "," +n2 + " and " +n3 + " is " + maximum);





}
}
