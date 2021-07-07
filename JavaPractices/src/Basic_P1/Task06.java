package Basic_P1;

import javax.swing.JOptionPane;

public class Task06 {

	// Write a Java program to print the sum (addition), multiply, subtract, divide
	// and remainder of two numbers
	public static void main(String[] args) {

		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Input first number"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Input second number"));

		int z = x + y;
		int a = x * y;
		float b = (float) x - y;
		float c = (float) x / y;
		float d = (float) x % y;

		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
