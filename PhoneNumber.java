package FeetNumber;

import java.util.Scanner;

/*
Mila Arkhiptcova
The international standard letter/number mapping for telephones is given 
in this Exercise.  Write a method that returns a number, given an uppercase letter,
as follows:
public static int getNumber (char uppercaseLetter)
Write a test program that prompts the user to enter a phone number as a string.
The input number may contain letters.The program translates a letter
 (uppercase or lowercase) to a digit and leaves all other characters intact. 

Here are sample runs of the program:
Enter a  string: 1-800-Flowers [enter]
1-800-3569377
Enter a string: 1800flowers [enter]
18003569377

09/24/2019
Bellevue University
PhoneNumber.java
*/
public class PhoneNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// ask the user to enter a phone number as a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		// Translate a letter to a digit and leaves all other character intact
		for (int i = 0; i < string.length(); i++) { //for loop for intereation 
			//checks if the all symbols of input are letters
			if (Character.isLetter(string.charAt(i))) 
				//gives all letters Upper Case 
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			else
				System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	//Method getNumber returns a number, given an uppercase letter 
	public static int getNumber(char uppercaseLetter) {
		// Return the character's number reference in the international 
		// standard letter/number mapping for telephones
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else if (uppercaseLetter >= 'A')
			return 2;
		else
			return 0;
	}

	}

