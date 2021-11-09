package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.hamcrest.core.SubstringMatcher;

public class HangMan implements KeyListener {
	Stack<String> words = new Stack<String>();
	String secretWord;
	String underscores;
	String key;
	char keyPress;
	int numberoflives;

	public static void main(String[] args) {
		String underscores = "";
		int numberoflives = 5;
		String secretWord = Utilities.readRandomLineFromFile("dictionary.txt");
		String numberofWords = JOptionPane.showInputDialog(null, "Pick a number between 1 and 10");
		int number = Integer.parseInt(numberofWords);
		for (int i = 0; i < number; i++) {
			words.push(secretWord);
		}

		new HangMan().run();
	}

	void run() {
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
		frame.addKeyListener(this);
		 String numberoflivess=Integer.toString(numberoflives);
		JLabel wordbank = new JLabel(blanklabel);
		JLabel lives = new JLabel(numberoflivess);
		panel.add(wordbank);
		panel.add(lives);

		for (int j = 0; j < firstword.length(); j++) {
			char letter = firstword.charAt(j);
			if (letter == keyPress) {
				blanklabel = blanklabel.substring(0, j) + keyPress + blanklabel.substring(j, blanklabel.length());
			}

			else {
				numberoflives--;
				run();

			}
		}
		run();
	}
	//when word has been solved, pop off a new one
	//reset lives
	//end when dead

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyPress = e.getKeyChar();

		keyPressed(e);
		for (int i = 0; i < secretWord.length(); i++) {
			String key = secretWord.charAt(i) + "";
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
