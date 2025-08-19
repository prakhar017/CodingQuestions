package prac.basics.mix;

import java.util.Scanner;

public class CountAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner scanner = new Scanner (System.in);
	  String input = scanner.next();
	  int[] arr = new int[256];
	
	  
	  for(int i =0;i<input.length();i++)
		  arr[input.charAt(i) ]++;
	  
	  
	  for( int i = 0; i < arr.length;i++)
		  System.out.println( (char) (i) + " --> "+ arr[i]);




/*		String input = "Hello World!";

		// Convert to lowercase to treat 'H' and 'h' as the same letter
		input = input.toLowerCase();

		// Create a HashMap to store letter frequencies
		Map<Character, Integer> letterFrequency = new HashMap<>();

		// Iterate over each character in the input string
		for (char c : input.toCharArray()) {
			// Only consider alphabetic characters
			if (Character.isLetter(c)) {
				letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
			}
		}

		// Print the frequency of each letter
		for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
			System.out.println("Letter: " + entry.getKey() + ", Frequency: " + entry.getValue());
		}*/
	 

	}




}
