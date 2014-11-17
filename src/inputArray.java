import java.util.Scanner;
public class inputArray {

	public static void main(String[] args) {
		
		String[] input= new String[3];

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value:");
		input[0] = scan.nextLine();
		System.out.println("Enter a value:");
		input[1] = scan.nextLine();
		System.out.println("Enter a value:");
		input[2] = scan.nextLine();
		
		System.out.println(input[0]+" "+input[1]+" "+input[2]);
		
		
	}

}
