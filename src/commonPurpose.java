
public class commonPurpose {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 7; i++){
			if(i == 1 || i == 7){
				System.out.println(i+": No activities");
			}else if(i == 2 || i == 6){
				System.out.println(i + ": Class");
			}else if( i == 4){
				System.out.println(i + ": Class, AP Prep");
			}else{
				System.out.println(i+ ": Class, lacrosse");
			}
		}//end of for loop

	}//main method

}//end of class
