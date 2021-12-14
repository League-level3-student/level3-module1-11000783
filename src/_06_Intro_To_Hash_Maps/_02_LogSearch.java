package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3; 
	HashMap<Integer, String> IDinput = new HashMap<Integer, String>();

}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void main(String[] args) {
		
	}
	void run () {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();

		frame.add(panel);
		frame.setVisible(true);
panel.add(button1);
panel.add(button2);
panel.add(button3);

button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);

		 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//how to change e to a variable that will equal a JButton
		if (e = button1) {
			String ID =	JOptionPane.showInputDialog(null, "Enter an ID number");
			int IDnumber = Integer.parseInt(ID);
			String name =	JOptionPane.showInputDialog(null, "Enter an ID number");
			IDinput.put(IDnumber, ID);
		}
	
if ( e = button2) {
	
}
	
}
	}
