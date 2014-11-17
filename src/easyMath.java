import java.util.Scanner;
public class easyMath {

	public static void main(String[] args) {
	//define variables
	String expression;
		
	//ask for input
	Scanner scan = new Scanner(System.in);
	System.out.println("Expression?");
	expression = scan.nextLine();
	
	//parse input
	
	String [] parts = expression.split(" ");
	String first = parts[0];
	String operator = parts[1];
	String second = parts[2];
	
	int First = Integer.parseInt(first);
	int Second = Integer.parseInt(second);
		
	//do math
	if(operator.equals("+")){
		System.out.println(First+Second);
	}else{
		System.out.println(First-Second);
	}	
	
	scan.close();
	}

}
