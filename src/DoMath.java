import java.util.Scanner;

public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		int number;
		int number_min = -500;
		int number_zero = 0;
		int number_max =  500;
		
		
		Scanner scan = new Scanner(System.in);
		
		//ask user for data
		System.out.println("Please enter an integer between -500 and 500.");
		
		//input user data
		number = scan.nextInt();
		
		
		
		
		if(number < number_min){
			System.out.println("Error. The number is less than -500.");
		}else if(number > number_max){
			System.out.println("Error. The number is more than 500.");
			}else if (number == number_zero){
				System.out.println("Error. Please enter a number other than zero.");
			}else if(number >=number_min && number < number_zero){
				number = number*2;
			}else if(number > number_zero && number <= number_max){
				number = number*number;
			}
		
		if(number % 10 == 0){
			System.out.println("The answer is " +number+"**");
		}else{
			System.out.println("The answer is " +number);
			
		}
		scan.close();
		
	}//end of main method

}//end of class
