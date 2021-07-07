package Basic_P1;

import javax.swing.JOptionPane;

public class Task07 {
	// Write a Java program that takes a number as input and prints its
	// multiplication table up to 10
	
	public static void main(String[] args) {
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Input a number for the multiplicaton till 10"));
		
		for (int i=0;i<10; i++ ) {
			System.out.println(a * (i+1));
		}
	}

}
