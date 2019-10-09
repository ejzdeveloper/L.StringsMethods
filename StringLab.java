package lab4_StringLab;

//Author: Jackie Zablah. Java Bootcamp 2019.
//STRING & METHODS

import java.util.Scanner;
import lab4_StringLab.StringMethods;

public class StringLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Capitalize Method:<<");
		System.out.println("Please enter a word to capitalize:<<");
		String string = scnr.nextLine();
		System.out.println(StringMethods.capitalize(string));
		scnr.nextLine();

		System.out.println("Where is Waldo Method");
		System.out.println("Enter a phrase that contains anywhere the word Waldo:");
		String phrase = scnr.nextLine();
		System.out.println("Index of Waldo in your phrase is: " + StringMethods.wheresWaldo(phrase));

		System.out.println("First Things First Method");
		System.out.println("Enter a word:<<");
		String word1 = scnr.nextLine();
		System.out.println("Enter a word:<<");
		String word2 = scnr.nextLine();
		System.out.println(StringMethods.firstThingsFirst(word1, word2));

		System.out.println("Reverse Method");
		System.out.println("Enter a string:<<");
		String string1 = scnr.nextLine();
		System.out.println(StringMethods.reverse(string1));

		System.out.println("So Long Method");
		System.out.println("Enter a word:<<");
		String a = scnr.nextLine();
		System.out.println("Enter a word:<<");
		String b = scnr.nextLine();
		System.out.println(StringMethods.soLong(a, b));
		scnr.nextLine();

		System.out.println("After Math Method");
		System.out.println("Enter a phrase:<<");
		String phrase1 = scnr.nextLine();
		System.out.println(StringMethods.afterMath(phrase1));

		System.out.println("Letterize method.");
		System.out.println("Enter a word:<<");
		String letterize = scnr.nextLine();
		StringMethods.letterize(letterize);
		
		System.out.println("camelCase method.");
		System.out.println("Enter a phrase:<<");
		String phrase2 = scnr.nextLine();
		System.out.println(StringMethods.camelCase(phrase2));

		System.out.println("This is All! Thanks, Goodbye!.");

		scnr.close();
	}

}
