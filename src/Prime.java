import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number to find if it's prime (or quit).");
		
		
		do{
		for(int a = scan.nextInt(); a == 2 || a % 2 == 1; a = scan.nextInt()){
			
			System.out.println(a+ " Is a prime number.");
			System.out.println("Type a number to find if it's prime (or quit).");
			
		}
		
		for(int a = scan.nextInt(); a % 2 == 0; a = scan.nextInt()){
			
			
			System.out.println(a+ " Is not a prime number.");
			System.out.println("Type a number to find if it's prime (or quit).");
		}
		scan.close();
		}while(true);
			
		
		
	

}
}//end of class
