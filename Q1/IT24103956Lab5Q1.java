import java.util.Scanner;

public class IT24103956Lab5Q1{
		public static void main (String [] args){

//create scanner object
Scanner scanner = new Scanner(System.in);

//Declare variables
int num1, num2, num3, smallest, largest;

//input the first integer
System.out.println("Enter the first integer: ");
num1 = scanner.nextInt();

//input the second integer
System.out.println("Enter the second integer: ");
num2 = scanner.nextInt();

//input the third integer
System.out.println("Enter the third integer: ");
num3 = scanner.nextInt();

//Assign smallest and largest to 'num1' initially
smallest = num1;
largest = num1;

//compare 'num2' with smallest and largest
if (num2 < smallest){
	smallest = num2;
}
if (num2 > largest){
	largest = num2;
}
//compare 'num3' with smallest and largest
if (num3 < smallest){
	smallest = num3;
}
if (num3 > largest){
	largest = num3;
}
//Display the results
	System.out.println();
	System.out.println("User Entered numbers are: " + num1 +" " + num2 + " " + num3);
	
	System.out.println("The smallest number is: " + smallest);
	System.out.println("The largest number is: " + largest);


}
}