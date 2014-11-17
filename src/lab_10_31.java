import java.util.Scanner;
public class lab_10_31 {

	public static void main(String[] args) {
		
		String question = "0";
		
		Scanner scan = new Scanner(System.in);
		while(!question.equals("quit")){
		System.out.println("Please ask a question!");
		question = scan.nextLine();
			if(!question.equals("quit")){
		answer();
		}}
		scan.close();
	}

	public static void answer(){
		
		if(Math.random() <= .3){
			System.out.println("Yes!");
		}else if(Math.random() <= .5 && Math.random() > .3) {
			System.out.println("No..");
		}else if (.5 < Math.random() && Math.random() <= .8){
			System.out.println("Maybe.");
		}else{
			System.out.println("The future is unclear.");
		}
	
	}
}
