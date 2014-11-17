import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		int b = 50;
		int range = (b - c) + 1;
		
		Scanner scan = new Scanner(System.in);
		int a = (int)Math.random();
		
		int myGuesses= makeGuesses(a,b,c,range);
		
		System.out.println(" guesses =" + myGuesses);
		scan.close();
	}//end of main method

	public static int makeGuesses(int a, int b, int c, int range){
		//tell that a has to be equal or more than 1 and less or equal to 50
		
		int guesses=0;
		do{
			if (a >= 48)break;
			a = (int)(Math.random() * range) + c;
			guesses++;
			
			System.out.println(" guess = " + a);
			
		}while(true);
		return guesses;
			
		
			
	}//end of makeGuesses method
}//end of class
