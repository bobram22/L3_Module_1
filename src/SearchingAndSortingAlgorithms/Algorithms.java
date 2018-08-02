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

	public static boolean containsSOS(List<String> message) {

		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}

		}
		// Add other methods here
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double temp = 0.0;
		int numSwaps = 1;
		while (numSwaps > 0) {
			numSwaps = 0;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					numSwaps++;
					temp = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, temp);
				}
			}
		}
		System.out.println(results);
		return results;
		// TODO Auto-generated method stub

	}

	public static List<String> sortDNA(List<String> dna) {
		String temp = "";
		int numSwaps = 1;
		while (numSwaps > 0) {
			numSwaps = 0;
			for (int i = 0; i < dna.size() - 1; i++) {
				if (dna.get(i).length() > dna.get(i + 1).length()) {
					numSwaps++;
					temp = dna.get(i);
					dna.set(i, dna.get(i + 1));
					dna.set(i + 1, temp);
				}
			}
		}
		return dna;
	}



public static List<String> sortWords(List<String> Words) {
	String temp = "";
	int numSwaps = 1;
	while (numSwaps > 0) {
		numSwaps = 0;
		for (int i = 0; i < Words.size() - 1; i++) {
			if (0<Words.get(i).compareTo(Words.get(i+1))) {
				numSwaps++;
				temp = Words.get(i);
				Words.set(i, Words.get(i + 1));
				Words.set(i + 1, temp);
			}
		}
	}
	return Words;
}
}