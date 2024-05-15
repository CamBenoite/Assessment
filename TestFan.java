/** 
	This class tests the ceiling fan class
	@author Cameron Benoite 
*/

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestFan{
	public static void main (String[] args){
		//create scanner object called scan
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter todays date (yyyy-mm-dd)");
		String date = scan.nextLine();		
		if(date.length() != 10){
			System.out.println("incorrect input");
			System.exit(0);
		}
		for(int i = 0; i < 10; i++){
			if(i == 4 || i == 7){
				if(!(date.charAt(i) == '-')){
					System.out.println("incorrect input");
				}
			}
			else if(date.charAt(i) > 57 || date.charAt(i) < 48){
				System.out.println("incorrect input");
			}
		}

		

		Fan fan = new Fan(0,0);

		if(date.charAt(6) == '2' && date.charAt(5) == '1' && date.charAt(8) == '2' && date.charAt(9) == '5') {
			int run = 0;
			while (run == 0){
				System.out.println("Choose a cord to pull, type 1 for speed and 2 for direction and 3 to quit.");
				String userChoice = scan.nextLine();
				if (userChoice.equals("1")){
					System.out.println("Its december 25th, therefore the fan stays off");
				}
				else if(userChoice.equals("2")){
					System.out.println("Its december 25th, therefore the fan stays off");
				}	
				else if(userChoice.equals("3")){
					System.out.println("Shutting down.");
					run = 1;
				}
				else{
					System.out.println("Incorrect input, Shutting down.");
					run = 1;
				}
			
			}
		}
		else{
			int run = 0;
			while (run == 0){
				System.out.println("Choose a cord to pull, type 1 for speed and 2 for direction and 3 to quit.");			
				String userChoice = scan.nextLine();			

				if (userChoice.equals("1")){
					System.out.println(fan.speedCord());
				}
				else if(userChoice.equals("2")){
					System.out.println(fan.directionCord());
				}	
				else if(userChoice.equals("3")){
					System.out.println("Shutting down.");
					run = 1;
				}
				else{
					System.out.println("Incorrect input, Shutting down.");
					run = 1;
				}
			}	
		}
	}
}
