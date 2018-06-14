package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equalsIgnoreCase("cracked")) {
				return (i);
			}
		}
		return (-1);
	}

	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				counter++;
			}
		}
		return counter;
	}

	public static Double findTallest(List<Double> tall) {
		Double tallest = 0.0;
		for (int i = 0; i < tall.size(); i++) {
			if (tall.get(i) > tallest) {
				tallest = tall.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int wordLength = 0;
		String LongestWord = "";
		for (int i = 0; i < words.size(); i++) {
			String currentWord = words.get(i);
			int wordSize = currentWord.length();
			if (wordLength < wordSize) {
				wordLength = wordSize;
				LongestWord = currentWord;
			}
		}
		return LongestWord;
	}

	public static boolean containsSOS(List<String> message1) {

		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).equalsIgnoreCase("... --- ...")) {
				return true;
			}
			
		}
		// Add other methods here
			return false;
	}
}