import java.util.Scanner;
public class monthDate {

	public static void main(String[] args) {
		String date = "0";
		int days = 0;
		
		System.out.println("Date (mm/dd)?");
		Scanner scan = new Scanner(System.in);
		date = scan.nextLine();
		
		String [] parts = date.split("/");
		String month = parts[0];
		String day = parts[1];
		//parse month & day
		//month will be one less
		int monthNumber = Integer.parseInt(month) - 1;
		int dayNumber = Integer.parseInt(day);
		
		int [] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 0; i < monthNumber; i++){
			days += monthDays[i];
		}
		days = days + dayNumber;
		
		System.out.println("This is day #"+days+" of the year.");
		
	}//end of main method

}//end of class
