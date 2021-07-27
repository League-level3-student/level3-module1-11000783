package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;


public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random randouble = new Random();
		for (int i = 0; i < args.length; i++) {
			Double randomdouble = randouble.nextDouble()*100;
			doubles.push(randomdouble);	
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
String string1 = JOptionPane.showInputDialog(null, "Choose a number between 1 and 100");
String string2 = JOptionPane.showInputDialog(null, "Choose a different number between 1 and 100");

 Double double1 = Double.parseDouble(string1);
 Double double2 = Double.parseDouble(string2);


		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
 Double lownum;
 Double highnum;

 if (double1 < double2) {
	double1 = lownum;
	double2 = highnum;
}
 else {
	 double2 = lownum;
	double1 = highnum;
}
//I don't know how whiles work	
 while (doubles.isEmpty()) {
		type type = (type) en.nextElement();
		
	} (lownum < doubles.pop() < highnum) {
		System.out.println(doubles.pop());
	}
		System.out.println(doubles.pop());
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
