import java.util.Scanner;
public class convertNumbers {

	public static void main(String[] args) {
		String number = "0";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Number?");
		
		number = scan.nextLine();
		String [] parts = number.split("");
		int length = parts.length;
		
		if(length == 1){
			if(parts[0].equals("1")){
				System.out.println("One");
			}else if(parts[0].equals("2")){
				System.out.println("Two");
			}else if(parts[0].equals("3")){
				System.out.println("Three");
			}else if(parts[0].equals("4")){
				System.out.println("Four");
			}else if(parts[0].equals("5")){
				System.out.println("Five");
			}else if(parts[0].equals("6")){
				System.out.println("Six");
			}else if(parts[0].equals("7")){
				System.out.println("Seven");
			}else if(parts[0].equals("8")){
				System.out.println("Eight");
			}else if(parts[0].equals("9")){
				System.out.println("Nine");
			}
		}
		if(length == 2){
			if(parts[0].equals("1")){
				if(parts[1].equals("0")){
					System.out.println("Ten");
				}else if(parts[1].equals("1")){
					System.out.println("Eleven");
				}else if(parts[1].equals("2")){
					System.out.println("Twelve");
				}else if(parts[1].equals("3")){
					System.out.println("Thirteen");
				}else if(parts[1].equals("4")){
					System.out.println("Fourteen");
				}else if(parts[1].equals("5")){
					System.out.println("Fifteen");
				}else if(parts[1].equals("6")){
					System.out.println("Sixteen");
				}else if(parts[1].equals("7")){
					System.out.println("Seventeen");
				}else if(parts[1].equals("8")){
					System.out.println("Eighteen");
				}else if(parts[1].equals("9")){
					System.out.println("Nineteen");
				}
				
			}else if(parts[0].equals("2")){
				System.out.print("Twenty");
			}else if(parts[0].equals("3")){
				System.out.print("Thirty");
			}else if(parts[0].equals("4")){
				System.out.print("Forty");
			}else if(parts[0].equals("5")){
				System.out.print("Fifty");
			}else if(parts[0].equals("6")){
				System.out.print("Sixty");
			}else if(parts[0].equals("7")){
				System.out.print("Seventy");
			}else if(parts[0].equals("8")){
				System.out.print("Eighty");
			}else if(parts[0].equals("9")){
				System.out.print("Ninety");
			}
		if(length == 2){
			if(parts[1].equals("1")){
				System.out.print(" one");
			}else if(parts[1].equals("2")){
				System.out.print(" two");
			}else if(parts[1].equals("3")){
				System.out.print(" three");
			}else if(parts[1].equals("4")){
				System.out.print(" four");
			}else if(parts[1].equals("5")){
				System.out.print(" five");
			}else if(parts[1].equals("6")){
				System.out.print(" six");
			}else if(parts[1].equals("7")){
				System.out.print(" seven");
			}else if(parts[1].equals("8")){
				System.out.print(" eight");
			}else if(parts[1].equals("9")){
				System.out.print(" nine");
			}
		}
		}
	scan.close();	
	}

}
