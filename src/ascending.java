import java.util.Scanner;
public class ascending {

	public static void main(String[] args) {
		String input = "0";
		Scanner scan = new Scanner(System.in);
		System.out.println("Series? (example: series1 2 3 4 5 3)");
		input = scan.nextLine();
		int largest = 0;
		int numberMore = 0;
		
		String [] parts = input.split(" ");
		String series = parts[0];
		
		int length = parts.length;
		
		for(int i= 1; i < (length-1); i++){
			int number = Integer.parseInt(parts[i]);
			numberMore = Integer.parseInt(parts[i+1]);
			if(number < numberMore){
				largest = numberMore;
			}	
		}
		if(largest == numberMore){
			System.out.println("Series "+series+ " is ascending.");
		}else{
			System.out.println("Series " + series+ " is not ascending.");
		}
	scan.close();
	}
}
