import java.util.Scanner;
public class chunks {

	public static void main(String[] args) {
		//define variables
		String phrases;
		int size = 0;
		
		//ask for input and use input
		System.out.println("String?");
		
		Scanner scan = new Scanner(System.in);
		phrases = scan.nextLine();
		
		System.out.println("Chunk size?");
		size = scan.nextInt();
		
		int a = 0;
		
		
		
		
		while( a+4 < (phrases.length() - 1)){
			
			
			System.out.println(phrases.substring(a, a+ size));
			a = a+size;
			
		}
		
		if(phrases.length() % size != 0){
			
			System.out.println(phrases.substring(a, phrases.length()));
		}
		
		
	
		scan.close();
	}//end of main method

}//end of class
