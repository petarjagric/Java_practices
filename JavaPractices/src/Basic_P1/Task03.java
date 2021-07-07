package Basic_P1;

import javax.swing.JOptionPane;

public class Task03 {

	// Write a Java program to divide two numbers and print on the screen.
	public static void main(String[] args) {
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Input first whole number"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Input second whole number"));
		
		float c = (float) a/b;
		
		System.out.println(c);
		
	}
}
