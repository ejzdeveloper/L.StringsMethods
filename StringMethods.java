// Author: Jackie Zablah. Java Bootcamp 2019.
//STRING & METHODS.

package lab4_StringLab;

public class StringMethods {

	public static String capitalize(String word) {
		word = (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
		return word;
	}

	public static int wheresWaldo(String phrase) {
		int indexOfWaldo = phrase.indexOf("Waldo");
		return indexOfWaldo;
	}

	public static String firstThingsFirst(String a, String b) {
		String word1 = a;
		String word2 = b;
		int compare = word1.compareTo(word2);

		if (compare < 0) {
			return (word1 + " " + word2);
		} else
			return (word2 + " " + word1);
	}

	public static String reverse(String s) {
		String str = s;
		StringBuilder myString1 = new StringBuilder(str);
		return (myString1.reverse().toString());
	}

	public static String afterMath(String phrase) {
		int index = phrase.indexOf("math");
		if (index >= 0) {
			return (phrase.substring(index, phrase.length()));
		} else
			return ("dud");
	}

	public static String soLong(String a, String b) {
		int long1 = a.length();
		int long2 = b.length();

		if (long1 > long2) {
			return (a);
		} else if ((long2 > long1)) {
			return (b);
		} else {
			return (a + " " + b);
		}

	}

	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	
	public static String camelCase(String phrase2) {
		String[] arrOfwords = phrase2.split(" ");
		String camelPhrase = "";

		for (int i = 1; i < arrOfwords.length; i++) {
			arrOfwords[i] = arrOfwords[i].substring(0, 1).toUpperCase() + arrOfwords[i].substring(1).toLowerCase();
			camelPhrase += arrOfwords[i];
		}

		String camelCase = arrOfwords[0].toLowerCase() + camelPhrase;
		return camelCase;
	}

}
