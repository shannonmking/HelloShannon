import java.util.Scanner;
public class dates {

	public static void main(String[] args) {
		//declare variables
		String date;
		
		
		//ask user for input
		System.out.println("Please enter a date (mm/dd/yyyy).");
		Scanner scan = new Scanner(System.in);
		date = scan.nextLine();
		
		String [] parts = date.split("/");
		String month = parts[0]; //this is the month 
		String day = parts[1];//this is the day
		String year = parts[2];//this is the year
		
		//convert months
		
		if(month.equals("01")){
			System.out.print("Jan ");
		}else if(month.equals("02")){
			System.out.print("Feb ");
		}else if(month.equals("03")){
			System.out.print("Mar ");
		}else if(month.equals("04")){
			System.out.print("Apr ");
		}else if(month.equals("05")){
			System.out.print("May ");
		}else if(month.equals("06")){
			System.out.print("Jun ");
		}else if( month.equals("07")){
			System.out.print("Jul ");
		}else if(month.equals("08")){
			System.out.print("Aug ");
		}else if(month.equals("09")){
			System.out.print("Sep ");
		}else if(month.equals("10")){
			System.out.print("Oct ");
		}else if(month.equals("11")){
			System.out.print("Nov ");
		}else if(month.equals("12")){
			System.out.print("Dec ");
		}
		
		System.out.print(day+", " + year);
		
	scan.close();
	}//end of main method

}//end of class
