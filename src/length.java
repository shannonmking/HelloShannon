import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		
		//declare variables
		String Word;
		String NewWord = "a";
		
		//ask for input
		System.out.println("Word? (or quit)");
		
		Scanner scan = new Scanner(System.in);
		
		//loop
		for(Word = scan.nextLine(); !Word.equals("quit"); Word = scan.nextLine()){
			
			System.out.println("Word? (or quit)");
			
			if(Word.length() > NewWord.length()){
				NewWord = Word;
			}//end of if
		
			
		}//end of for
		
		
		//print longest word and length
		System.out.println("The longest word was " + NewWord + " and it was "+ NewWord.length()+ " letters long.");
	
		scan.close();
	
	}//end of main method

}//end of class
