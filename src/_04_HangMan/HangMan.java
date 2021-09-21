package _04_HangMan;

import java.util.Random;

import javax.swing.JOptionPane;

public class HangMan{
	public static void main(String[] args) {
	String numberofWords = JOptionPane.showInputDialog(null, "Pick a number between 1 and 10");
	int number = Integer.parseInt(numberofWords);
	
	String secretWord = Utilities.readRandomLineFromFile("dictionary.txt");
	
		
	
	
	}
	}
	
	

