package _04_HangMan;

import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {

	public static void main(String[] args) {
		Stack<String> words = new Stack<String>();

		String numberofWords = JOptionPane.showInputDialog(null, "Pick a number between 1 and 10");
		int number = Integer.parseInt(numberofWords);
		String secretWord = Utilities.readRandomLineFromFile("dictionary.txt");
		for (int i = 0; i < number; i++) {
			words.push(secretWord);
		}
		String firstword = words.pop();
		int numberofletters = firstword.length();
		String blanklabel = "";
		for (int i = 0; i < numberofletters; i++) {
			blanklabel += "_";
		}
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.addKeyListener(null);
		JLabel letter1 = new JLabel(blanklabel);
		panel.add(letter1);

	}
}
