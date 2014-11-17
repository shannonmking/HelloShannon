import java.util.Scanner;
public class phraseWord {

	public static void main(String[] args) {
		String phrase = "0";
		Scanner scan = new Scanner(System.in);
		String word = "0";
		int i  = 0;
		System.out.println("Phrase?");
		phrase = scan.nextLine();
		String wordToFind = "0";
		String quit = "quit";		
		String [] parts = phrase.split(" ");
		while(wordToFind != quit){
			System.out.println("Word?");
			wordToFind = scan.nextLine(); 
			boolean found = false;
			if(!wordToFind.toLowerCase().equals(quit)){
				for(i = 0; i < parts.length; i++){
					word = parts[i];
					if(wordToFind.toLowerCase().equals(word)){
						found = true;
					}
				}
				if(found){
					System.out.println("Found word");
				}else{
					System.out.println("Didn't find word");
				}
			}else{
				System.out.println("were done");
				break;
			}
			
		}//end of while	
	}//end of method	
}//end of class


