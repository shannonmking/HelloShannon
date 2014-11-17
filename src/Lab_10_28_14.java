import java.util.Scanner;
public class Lab_10_28_14 {

	public static void main(String[] args) {
	//declare variables
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	String quit = "quit";
	Scanner scan = new Scanner(System.in);
	//ask user
	
	System.out.println("First number:");
		num1 = scan.nextInt();
	System.out.println("Second number:");
		num2 = scan.nextInt();
	System.out.println("Third number:");
		num3 = scan.nextInt();
		
	//print out the return from maxNumber
	System.out.println(num1+ " "+num2+" "+num3);
	maxNumber(num1, num2, num3);
	
	scan.close();
	}//end of main

	public static void maxNumber(int num1, int num2, int num3){
		
		if(num1 > num2 && num1 > num3){
			System.out.println("The greatest number is "+num1);
		}else if(num2 > num3 && num2 > num1){
			System.out.println("The greatest number is "+num2);
		}else{
			System.out.println("The greatest number is "+num3);
		}
	}
		//returns largest
	
}//end of class
