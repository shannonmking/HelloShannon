import java.util.Scanner;


public class food {

public static void main(String[] args) {
				//define variable
				Scanner scan = new Scanner(System.in);
				//ask favorite food
				System.out.println("What is your favorite food?");
				
				
				//ask for favorite food
				String favfood = scan.nextLine();
				
				
				//repeat what the favorite food is
				System.out.println("\nYour favorite food is " + favfood + ".");
				
				
				//close the instance
				scan.close();
			}

		}

	
