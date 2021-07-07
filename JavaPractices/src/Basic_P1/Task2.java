package Basic_P1;

import javax.swing.JOptionPane;

public class Task2 {
	// Write a Java program to print the sum of two numbers.
	public static void main(String[] args) {
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Input the first whole number"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Input second whole number"));
		
		System.out.println(a+b);
		
		
	}
}
