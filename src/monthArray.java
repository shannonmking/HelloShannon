import java.util.Scanner;
public class monthArray {

	public static void main(String[] args) {
		
		int month = 0;
		System.out.println("Month Number?");
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt() - 1;
		
		String[] newMonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.println(newMonth[month]);
	
		scan.close();
	}

}
