import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1;
		int max = 6;
		int a = (int)Math.random();
		int b = (int)Math.random();
		int range = (max-min)+min;
		
		Scanner myscan = new Scanner(System.in);
		//ask for dice sum
		
		
		diceSum(myscan,min, range);
			
		myscan.close();
		
	}//end of main method
	
	public static void diceSum(Scanner myscan,int min, int range){
		int c; 
		do{	
			System.out.println("Type in a number for the desired dice sum.");
			//input desired dice sum
			c = (int) myscan.nextInt();	
			// here im making sure user inputs a value between 2 and 12
			if(c > 12 || c < 2){
				// HERE will be a great place to clear the console
				System.out.println("Please enter a number between 2 and 12.");
			}
			else{
				// ah they did... let get out of here yeeee
				break;
			}
			
		}while(true);
		
		do{
			// lets get the random die numbers	
		    int a = (int)(Math.random()* range) + min;
		    int b = (int)(Math.random()* range) + min;
		    
		    // ok now evaluate the random numbers to see if we satisfy our program requirements 
		    if ((a+b) == c){
		    	System.out.println( a + " and " + b + " = " + c );	
		    	break;
		    }
		    else{
		    	System.out.println( a + " and " + b + " = " + (a+b));
		    }
		}while(true);
		return;
	}//end of diceSum 
}//end of main class
