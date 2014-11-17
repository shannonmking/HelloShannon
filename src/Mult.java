import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int product = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type in a number that you want multiplied between 1 and 50.");
		
		
		for(a = scan.nextInt(); b <= a; b++){
			
			product = b * a;
			System.out.println( b + " * " + a + " = " + product );
			
		}
		scan.close();
	}//end of main method

}//end of class
