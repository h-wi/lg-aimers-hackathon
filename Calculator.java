package Q3;

import javax.swing.JFrame;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame = new CalculatorFrame();
		frame.setSize(500, 300);
		frame.setTitle("GUI Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
