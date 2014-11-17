import java.util.Scanner;
public class Divisors {

	public static void main(String[] args) {
		//declare variable n and c
		int n;
		int c;
		
		//get input number n
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to examine.");
		n = scan.nextInt();
		//check each number c between 2 and n-1.
		
		c = 2;
		while (c < n)
		{
			// n % c == 0 if c is a divisor 
			if( n % c == 0)
				System.out.println( c + " Is a factor of " +n);
			c++;
		}
		
		//say good bye
		System.out.println("All done!");
		
	}

}
