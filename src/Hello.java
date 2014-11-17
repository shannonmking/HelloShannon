//import class library
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//prompt user for name
		System.out.println("What is your Name?");
		
		String input = scan.nextLine();
		
		System.out.println("\n\n Hello " + input + ". How are you this morning?");
		
		//close the scan instance when we are done with it
		scan.close();
		
	}

}
