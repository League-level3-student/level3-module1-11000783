package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList <String> words = new ArrayList <String>();
words.add("something");
words.add("string");
words.add("biology");
words.add("new");
words.add("old");
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < words.size(); i++) {
			//System.out.println(words.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for(String word: words) {
			//System.out.println(word);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < words.size(); i+=2) {
			//System.out.println(words.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = words.size()-1 ; i >= 0 ; i--) {
			//System.out.println(words.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < words.size(); i++) {
String word = words.get(i);			
			if (word.contains("e")) {
				System.out.println(word);
			}
				
			}
			
		}
	}
