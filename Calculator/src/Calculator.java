import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	
	JFrame frame;
	JTextArea textarea;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subtractButton, divideButton, multiplyButton;
	JButton decimalButton, clearButton, equalsButton, deleteButton;
	JPanel panel;
	
	Font myFont = new Font("Monserrat", Font.BOLD, 30);
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	

	public Calculator() {
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(455, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.print("Blal");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	

}
