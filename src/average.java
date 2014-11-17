import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		String numbers = "0";		
		int sum = 0;
		double average = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Values?");
		numbers = scan.nextLine();
		
		String [] parts = numbers.split(" ");
		
		for(int i = 0; i < parts.length; i++){
			int newNum = Integer.parseInt(parts[i]);
			sum += newNum;
			average = sum/(i+1);
		}
		
		System.out.println("Average: "+average);
		
	scan.close();	
	}//end of method

}//end of class
