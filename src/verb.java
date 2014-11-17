import java.util.Scanner;
public class verb {

	public static void main(String[] args) {
		
		//declare variables
		String sentence;
		String verb;
		
		
		//user input
		System.out.println("Phrase with <verb> marker?");
		Scanner scan = new Scanner(System.in);
		sentence = scan.nextLine();
		
		
		System.out.println("Verb?");
		verb = scan.nextLine();
		
		//split
		String [] parts = sentence.split("<");
		String beforeVerb = parts[0];
		
		String [] parts2 = sentence.split(">");
		String afterVerb = parts2[1];
		
		//print final

		System.out.println(beforeVerb+verb+ afterVerb);
		
		scan.close();
	}//end of main

}//end of class
