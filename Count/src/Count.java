// ********************************************************************
// Count.java
// 
// This program read in strings (phrases) and counts the number of 
// blank characters and certain other letters in the phrases
// ********************************************************************

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		
		String phrase;		// a string of characters
		int countBlank;		// the number of blanks (spaces) in the phrase
		int length;			// the length of the phrase
		char ch;			// an individual character in the string
		int countA, countE, countS, countT;
		String quit;
				
		Scanner scan = new Scanner(System.in);
		
		// print program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		
		// read in a string and find it's length
		System.out.println("Enter a sentence or phrase (or quit to quit the program): ");
		phrase = scan.nextLine();
		length = phrase.length();
		quit = phrase;
					
		
		while (!"quit".equalsIgnoreCase(quit)) {
			
			// initialize counts
			countBlank = 0;
			countA = 0; 
			countE = 0;
			countS = 0;
			countT = 0;
				
			// a for loop to go through the string character by character
			for (int i = 0; i <= length - 1; i++) {
			
				ch = phrase.charAt(i);
			
				switch(ch) {
				
				case 65:	case 97:
					countA++;					
					break;
				
				case 69:	case 101:
					countE++;
					break;
				
				case 83:	case 115:
					countS++;
					break;
				
				case 84:	case 116:
					countT++;
					break;
				
				case 32:
					countBlank++;
					break;
			}
				
		}
		// Print the results
		System.out.println("Number of A's : " + countA);
		System.out.println("Number of E's : " + countE);
		System.out.println("Number of S's : " + countS);
		System.out.println("Number of T's : " + countT);
		System.out.println("Number of blank spaces: " + countBlank);
		
		// read in a string and find it's length
		System.out.println("Enter a sentence or phrase (or quit to quit the program): ");
		phrase = scan.nextLine();
		length = phrase.length();
		quit = phrase;
		}
	}
}
