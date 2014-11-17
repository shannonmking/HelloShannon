import java.util.Scanner;
public class fracCalcPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 0;
		int divisor = 0;
		int wholeNum = 0;
		int dividend2 = 0;
		int divisor2 = 0;
		int wholeNum2 = 0;
		String operator;
		int remainder = 0;
		int remainder2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		//ask user for input for first fraction
		System.out.println("First Fraction:");
		System.out.println("Whole Number:");
		wholeNum = scan.nextInt();
		
		System.out.println("Numerator:");
		dividend = scan.nextInt();
		
		System.out.println("Denominator:");
		divisor = scan.nextInt();
		
		
		//ask user input for operation
		System.out.println("Operation:");
		operator = scan.nextLine();
		
		//ask user input for second fraction
		
		System.out.println("Second Fraction:");
		System.out.println("Whole Number:");
		wholeNum2 = scan.nextInt();
		
		System.out.println("Numerator:");
		dividend2 = scan.nextInt();
		
		System.out.println("Denominator:");
		divisor2 = scan.nextInt();
		
		//simplify the fractions
		wholeNum = dividend/divisor + wholeNum;
		remainder = dividend % divisor;
		
		wholeNum2 = dividend2/divisor2 + wholeNum2;
		remainder2 = dividend % divisor;
		
	    // I added a comment	
		
		
		scan.close();
	}//end of main method

	public static int commonDenominator(int divisor, int divisor2){
		
		return commonDenominator(divisor2, divisor % divisor2);
	
		
	}
}//end of class
