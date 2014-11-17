import java.util.Scanner;
public class phrase {

	public static void main(String[] args) {
		String Phrase;
		char blank = ' ';
		
		
		//ask user for input
		System.out.println("Please enter a phrase.");
		Scanner scan = new Scanner(System.in);
		Phrase = scan.nextLine();
		
		//print the first letter of the first word (no blanks in front of it)
		System.out.print(Phrase.charAt(0));
		
		//find the blanks
		
		
		for(int a = 0; a < Phrase.length(); a++){
			
			if(Phrase.charAt(a) == blank){
				System.out.print(Phrase.charAt(a + 1));
			}
		}
		
	
		//print the first letter of each word
			
	
		scan.close();
	}//end of main method

}//end of class
