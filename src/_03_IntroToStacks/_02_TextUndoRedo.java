package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * JPanel panel = new JPanel("Panel"); JLabel label = new JLabel("JLabel");
	 * frame.add(panel); panel.add(label); Every time a key is pressed, add that
	 * character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JLabel label = new JLabel("Text: ");
	JFrame frame = new JFrame("Frame");
	Stack<Character> deleted = new Stack<Character>();
	String text;

	void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.pack();
		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(e.getKeyCode());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// No letters going away but they are coming up
		// TODO Auto-generated method stub
	text = label.getText();
		if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
			System.out.println("back");
			if (text.length() > 0) {
				deleted.push(text.charAt(text.length() - 1));
				text = text.substring(0, text.length() - 1);		
				
			}
		}
		else if(e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			if(!deleted.isEmpty()) {
				text+=deleted.pop();
		
			}
		}
		 else {
			text += e.getKeyChar();
		
		}
	

//	System.out.println(e.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(text);
		label.setText(text);
	

	}
}
