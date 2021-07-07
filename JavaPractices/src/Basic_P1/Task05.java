package Basic_P1;

import javax.swing.JOptionPane;

public class Task05 {

	// Write a Java program that takes two numbers as input and display the product
	// of two numbers.
	public static void main(String[] args) {

		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Input first number"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Input second number"));

		float a = (float) x + y;

		System.out.println(x + " + " + y + " = " + a);

	}
}
