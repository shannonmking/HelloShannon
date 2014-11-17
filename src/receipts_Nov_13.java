import java.util.Scanner;
public class receipts_Nov_13 {

	public static void main(String[] args) {
		int receipts = 0;
		int items = 0;
		double price = 0.0;
		double adder = 0.0;
		
		//ask for number of receipts
		System.out.println("How many receipts are there?");
		Scanner scan = new Scanner(System.in);
		
		receipts = scan.nextInt();
		scan.nextLine();
		//create a loop that goes for the number of items there are
		for(int i = 0; i < receipts; i++){
			System.out.println("How many items are on this receipt?");
			items = scan.nextInt();
			
			double [][]itemNumber = new double[receipts][items];
			
			for(int k = 0; k < items; k++){
			System.out.println("Price of item "+(k+1)+"?");
			price = scan.nextDouble();
			
			itemNumber[i][k] = price;
			adder += price;
			}
			System.out.println("Receipt "+(i+1)+" cost: $"+adder);
		
		}

	}

}
