import java.util.Scanner;

public class initials {

	public static void main(String[] args) {
		//declare variables
		String Name;
		char WhiteSpace = ' ';
		//ask for user input
		
		System.out.println("Please enter your first and last name.");
		
		Scanner scan = new Scanner(System.in);
		Name = scan.nextLine();
		
		
		
		
		//find the delimiter
		
		int a = 0;
		
		while(WhiteSpace != Name.charAt(a)){
			a++;
		}
		
		
		
		//extract the first letter of the first name
		char firstInitial = Name.charAt(0);
		
		
		//extract last name
		
		String lastName = Name.substring(a + 1, Name.length());
		
		
		//print last name, initial

		System.out.println(lastName+ ", "+ firstInitial+("."));
		
		
	scan.close();	
	}//end of main method

}//end of class
