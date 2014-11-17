import java.util.Scanner;
public class Lab_10_27_14 {

	public static void main(String[] args) {
		String phrase = "0";
		String quit = "quit";
		Scanner scan = new Scanner(System.in);
		
		while(!phrase.equals(quit)){
		
		System.out.println("Input a phrase!");
		phrase = scan.nextLine();
		
		if(!phrase.equals(quit)){
				countWords(phrase);
		}
		
		
		}
		scan.close();
	}//end of main 

	public static void countWords(String phrase){
		String [] parts = phrase.split(" ");
		int numWords = parts.length;
		System.out.println(numWords);
	}
	
}//end of class
