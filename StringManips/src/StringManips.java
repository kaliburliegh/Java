import java.util.Scanner;

public class StringManips {

	/**
	 * Nicholas Land
	 * CSE 230
	 * Project 2
	 */
	public static void main(String[] args) {
		
		String phrase = new String("This is a String test.");
		int phraseLength;	// number of characters in the phrase String
		int middleIndex;	// index of the middle character in the string
		String firstHalf;	// first half of the phrase String
		String secondHalf;	// second half of the phrase String
		String switchedPhrase;	// a new phrase with original halves switched
		String middle3; // middle three characters of phrase
		String city;
		String state;
		String stateUpper;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your hometown City: ");
		city = scan.nextLine();
		System.out.println("Please enter your hometown State: ");
		state = scan.nextLine();
		scan.close();
		
		stateUpper = state.toUpperCase();
		
		// compute the length and middle index of the phrase
		phraseLength = phrase.length();
		middleIndex = phraseLength / 2;
		
		// get the substring for each half of the phrase
		firstHalf = phrase.substring(0, middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);
		middle3 = phrase.substring(middleIndex-1, middleIndex+1);
		
		// concatenate the firstHalf at the end of the secondHalf
		switchedPhrase = phrase.replace(" ", "*");
		
		// print information about the phrase
		System.out.println();
		System.out.println("Original phrase: " + phrase);
		System.out.println("Length of the Phrase: " + phraseLength + " characters");
		System.out.println("Index of the middle: " + middleIndex);
		System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
		System.out.println("Switched phrase: " + switchedPhrase);
		System.out.println("Middle 3: " + middle3);
		System.out.println(stateUpper + city + stateUpper);
		
	}

}
