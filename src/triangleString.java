import java.util.Scanner;
public class triangleString {

	public static void main(String[] args) {
		//define variables
		String sentence;
		//ask for input
		
		Scanner scan = new Scanner(System.in);
		System.out.println("String?");
		sentence = scan.nextLine();
		int a = 0;
		int i = 1;
		//nested for statement
		while(a+i < sentence.length()){
			
			System.out.println(sentence.substring(a,a+i));
			a=a+i;
			i++;
			
		}
		if(sentence.length() % a+i != 0){
			System.out.println(sentence.substring(a, sentence.length()));
		}	
		
		
		scan.close();
	}

}
