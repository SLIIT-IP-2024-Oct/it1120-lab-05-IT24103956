import java.util.Scanner;

public class IT24103956_Lab5_Q3{

		//Constants
		static final double ROOM_CHARGE_PER_DAY = 48000.0;

		public static void main (String [] args) {	
			Scanner scanner = new Scanner(System.in);

			//Variables
			int startDate, endDate, numberOfDaysReserved;
			double totalAmountToBePaid, discountRate = 0.0;

			//Get start date
			System.out.println("Enter Start Date (1 - 31) : ");
			startDate = scanner.nextInt();
		
			//Get end date
			System.out.println("Enter End Date (1 - 31) : ");
			endDate = scanner.nextInt();
		
			//Validate dates
			if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
				System.out.println("Error : Days must be between 1 and 31");
				return;
			}
			if (startDate >= endDate) {
				System.out.println("Error : Start Date must be less than End date");
				return;
			}
			

			//Calculate the Reserved Days
			numberOfDaysReserved = (endDate - startDate);

			//Discount Rate
			if (numberOfDaysReserved>=5){
				discountRate = 0.2;
			}else if(numberOfDaysReserved>=3){
				discountRate = 0.1;
			}

			//Calculate the total amount
			totalAmountToBePaid = (ROOM_CHARGE_PER_DAY*numberOfDaysReserved)*(1-discountRate);
			//Display results
			System.out.println("Room Charge per Day :" + ROOM_CHARGE_PER_DAY);
			System.out.println("Number of Days Reserved :" +numberOfDaysReserved);
			System.out.println("Total Amount to be paid :" + totalAmountToBePaid);
	}
}
		