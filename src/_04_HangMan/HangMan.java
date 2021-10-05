package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> words = new Stack<String>();

	public static void main(String[] args) {

		String numberofWords = JOptionPane.showInputDialog(null, "Pick a number between 1 and 10");
		int number = Integer.parseInt(numberofWords);
		String secretWord = Utilities.readRandomLineFromFile("dictionary.txt");
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
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.addKeyListener(this);
		JLabel wordbank = new JLabel(blanklabel);
		panel.add(wordbank);
		
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		main.secretWord();
		e.getKeyChar();

		keyPressed(e);
		for (int i = 0; i < secretWord.length(); i++) {
		String key = secretWord.charAt(i);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
