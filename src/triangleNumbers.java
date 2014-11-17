import java.util.Scanner;
public class triangleNumbers {

	public static void main(String[] args) {
		int a = 0;
		
		//ask for user input
		System.out.println("Hello! Please enter a number for your triangle.");
		
		Scanner scan = new Scanner(System.in);
		//take user input
		a = scan.nextInt();
		
		for(int b = 1; b <= a; b++){
			for(int c = 1; c <= b; c++){
				System.out.print(c + " ");
				
			}
			System.out.println();//creates a new line to return to 1
		}//end of for loop
		

	
	scan.close();
	}//end of main method

}//end of class
