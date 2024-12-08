import java.util.Scanner;

public class IT24103956Lab5Q2{
	public static void main (String [] args){

//create scanner object
Scanner scanner = new Scanner(System.in);

//Declare variables
int newMembers;

//Input the number of new members and validate
	System.out.println("Enter the number of new members introduced: ");
	newMembers = scanner.nextInt();
if (newMembers<0){
	System.out.println("Input must be a number 0 or greater");
	return;
}
//Determine the prize using a SWITCH statement 
switch (newMembers){
	case 0:
		System.out.println("No Prize");
		break;
	case 1:
		System.out.println("Price is a: Pen");
		break;
	case 2:
		System.out.println("Price is a: Umbrella");
		break;
	case 3:
		System.out.println("Price is a: Bag");
		break;
	case 4:
		System.out.println("Price is a: Travelling Chair");
		break;
	default:
		System.out.println("Prize is a: Headphone");
		break;
	}

   }	


}