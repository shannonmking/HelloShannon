import java.util.Scanner;
public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter number to calculate its Factorial:");
	int factorialBase = scan.nextInt();
	int factorialAnswer = 1;
	int idx = 1;
	
	do{
		factorialAnswer *= idx++;
	}while (idx <= factorialBase);
	
	System.out.println("Factorial of " + factorialBase + " is " + factorialAnswer );
	
	scan.close();
	
	}//end of main method

}//end of class
