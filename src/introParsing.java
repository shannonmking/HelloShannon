import java.util.Scanner;

// HR:MIN
public class introParsing {

	public static void main(String[] args) {
		// declare variables
		
		String input;

		//get string to parse
		Scanner scan = new Scanner(System.in);
		System.out.println("Time?");
		input = scan.nextLine();
		
		//find the delimiter (:)
		
		int idx = 0;
		while(input.charAt(idx) != ':'){
			idx++;
		}
		
		
		// extract hours
		
		String hours = input.substring(0, idx);
		System.out.println("Hours:" + hours);
		
		
		//extract minutes
		
		String minutes = input.substring(idx + 1, input.length());
		System.out.println("Minutes:" + minutes);
		
		//print hrs and min
	
	scan.close();
	}
	

}
