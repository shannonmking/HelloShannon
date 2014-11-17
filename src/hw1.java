import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		String fraction = "0";
		boolean answer = false;
		System.out.println("Fraction?");
		Scanner scan = new Scanner(System.in);
		fraction = scan.nextLine();
		
		if(fraction.indexOf("_") != -1){
			answer = validateMixedFraction(fraction);
		}
		if((fraction.indexOf("_") == -1 ) && fraction.indexOf("/") ==-1 ){
			answer = validateNumber(fraction);
		}
		if((fraction.indexOf("_") == -1) && fraction.indexOf("/") != -1){
			answer = validateFraction(fraction);
		}
		
		if(answer == true){
			System.out.println("Fraction is correct.");
		}else{
			System.out.println("Fraction is incorrect.");
		}

	}//end of main

	public static boolean validateSimpleFraction(String fraction){
		String [] parts = fraction.split("/");
		String numerator = parts[0];
		String denominator = parts[1];
		
		if(denominator.charAt(0) == ('-')){
			System.out.println("Expected a sequence of digits instead of "+denominator);
			return false;
		}else{
			return true;
		}
	}
	
	
	public static boolean validateFraction(String fraction){
		String [] parts = fraction.split("/");
		//String numerator = parts[0];
		String denominator = parts[1];
		if(denominator.charAt(0) == ('-')){
			validateSimpleFraction(fraction);
		}
		if(parts.length != 2){
			System.out.println("Expected a number but none was found.");
			return false;
		}else{
			return true;
		}}

	public static boolean validateMixedFraction(String fraction){

		if(fraction.indexOf("/") < fraction.indexOf("_")){
			System.out.println("Did not find '/' after '_' in \""+ fraction+"\"");
			return false;
		}else{
			if(validateFraction(fraction) == true && validateNumber(fraction) == true){
				return true;
			}else{
				return false;
			}
			}
		}

public static boolean validateNumber(String fraction){
	if((fraction.indexOf("_") == -1 ) && fraction.indexOf("/") ==-1 ){
		
		try{
			int newFraction = Integer.parseInt(fraction);
		} catch (Exception e){
			System.out.println(e);
			return false;
		}
		return true;
	}else{
		String [] parts = fraction.split("_");
		String wholeNum = parts[0];
		
		try{
			int newWholeNum = Integer.parseInt(wholeNum);
		} catch(Exception e){
			System.out.println(e);
			return false;
		}
		return true;
	}
}
}//end of class


