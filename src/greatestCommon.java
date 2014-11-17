import java.util.Scanner;
public class greatestCommon {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		//ask what the user wants the first number to be
		System.out.println("Input the first number desired.");
		int a = scan.nextInt();
		//ask what the user wants the second number to be
		System.out.println("Input the second number desired.");
		int b = scan.nextInt();
		
		factor(a,b);
		System.out.println("The gcf is " +factor(a,b));
		scan.close();
	}//end of main method
	
	public static int factor(int a, int b){
		if(b==0){
			return a;
			
		}else{
		return factor(b, a % b);
		}	
	}
	}//end of class
