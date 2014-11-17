import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		
		String phrase;
		
		//ask for user input
		System.out.println("Please enter a phrase");
		Scanner scan = new Scanner(System.in);
		phrase = scan.nextLine();
		
		//split input
		String [] parts = phrase.split(" ");
		
		int lengthParts = parts.length;
		
		for(int i = lengthParts-1; i >= 0; i--){
			
			System.out.print(parts[i]+ " ");
		}
		
	scan.close();
	}//end of main method

}//end of class
