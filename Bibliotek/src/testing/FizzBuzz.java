package testing;

import javax.swing.JOptionPane;

public class FizzBuzz {

	public String checkFizzBuzz(int num) {
		String res;
		if (num%15 == 0)
			return "Fizz Buzz";
		else if (num%3 == 0)
			return "Fizz";
		else if (num%5 == 0)
			return "Buzz";
		return "" + num;
	}
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		
		JOptionPane.showMessageDialog
		(null, fb.checkFizzBuzz(Integer.parseInt(JOptionPane.showInputDialog("Enter a number"))));
	}
}