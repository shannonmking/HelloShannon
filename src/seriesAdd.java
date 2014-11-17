import java.util.Scanner;
public class seriesAdd {

	public static void main(String[] args) {
		String seriesinput = "0";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Series?");
		seriesinput = scan.nextLine();
		
		String [] parts = seriesinput.split(" ");
		int seriesinputlength = parts.length;
		int answer = 0;
		String series = parts[0];
		
		
		for(int i = 1; i < seriesinputlength; i++){
			
			int number = Integer.parseInt(parts[i]);
			answer = answer + number;	

		}
		
		System.out.println("sum("+series+") = "+answer);
	scan.close();	
	}//end of main

}//end of class
