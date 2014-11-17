import java.util.Scanner;
public class MTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time;
		int time_morning = 1159;
		int time_day = 1659;
		int time_dayMin = 1200;
		int time_evening = 2359;
		int time_eveningMin = 1700;
		Scanner scan = new Scanner(System.in);
		
		//ask for four numbers that do not end >60
		
		System.out.println("Please enter a four digit number for time in a day where the tens digit is not more than 5.");
		
		//input time
		
		time = scan.nextInt();
		
		if(time <= time_morning){
			//morning
			System.out.println("The time is " + time + ", good morning");
		//possible error messages
		}else if(time > time_morning && time < time_dayMin || time > time_day && time < time_eveningMin){
			System.out.println("Error. The tens digit cannot be more than 5.");
		
		}else if(time > time_evening){
			System.out.println("Error. Please enter a realistic time for a day (under 2400).");
		
		}else if (time <= time_day && time >= time_dayMin){
			System.out.println( "The time is " + time + ", good day");
		
		}else if (time >= time_eveningMin && time <= time_evening){
			System.out.println("The time is " + time + ", good evening");
		}
		
		scan.close();
		
	}//end of main method

}//end of class
