import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    // Create frame
    private JFrame frame;

    // Create textfield
    private JTextField textfield = new JTextField();

    // Store operator and operands
    String operator;
    double num1, num2, result;

    // Constructor
    Calculator() {
        // Create a frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create a panel
        JPanel panel = new JPanel();
        
        // Set the panel's layout
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add buttons
        String[] buttons = {"1", "2", "3", "+", 
                            "4", "5", "6", "-", 
                            "7", "8", "9", "*", 
                            "C", "0", "=", "/"};

        for (String buttonText : buttons) {
            JButton button = new JButton(buttonText);
            button.addActionListener(this);
            panel.add(button);
        }

        // Add textfield to frame
        frame.add(textfield, BorderLayout.NORTH);

        // Add panel to frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new Calculator();
    }

    // ActionPerformed method
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        // Clear the textfield if C is pressed
        if (command.equals("C")) {
            textfield.setText("");
            num1 = num2 = result = 0;
        } else if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            // If a number is pressed, append it to the textfield
            textfield.setText(textfield.getText() + command);
        } else {
            // If an operator is pressed
            operator = command;

            // Store the first number
            num1 = Double.parseDouble(textfield.getText());

            // Clear the textfield for the second number
            textfield.setText("");
        }

        // Calculate the result
        if (command.equals("=")) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }

            // Set the result as text of the textfield
            textfield.setText(String.valueOf(result));
        }
    }
}