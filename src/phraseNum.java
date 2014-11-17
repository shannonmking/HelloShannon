
public class phraseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Phrase = "Four score and seven years ago our fathers brought forth upon this continent, a new nation, conceived in liberty, and dedicated to the proposition that all men are created equal.";;
		int length = Phrase.length();
		int count;
		char vowel = 'e';
		
		for(int x=0; x< length; x++){
			
			if(vowel == Phrase.charAt(x)){
				System.out.println(x);
			}
		}
		
	
		
		
	}//end of main method

}//end of class
