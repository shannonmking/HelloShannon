import java.util.Scanner;
public class Lab_11_04_14 {

	public static void main(String[] args) {
		int i = 0;
		String name = "0";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many people are there?");
		i = scan.nextInt();
		scan.nextLine();
		
		String [] input = new String[i];
		
		for(int k = 0; k < i; k++){
			System.out.println("Enter the name of person "+k);
			input[k] = scan.nextLine();
			
		}
		int number = (int)Math.random() * (i);
		
		System.out.println("THE CHOSEN: "+input[number]);
	}

}
