
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean newNumber = true;

    public Calculator() {
        setTitle("Java Swing Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));

        // Display
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 28));
        add(display, BorderLayout.NORTH);

        // Buttons
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String input = e.getActionCommand();

        // Clear calculator
        if (input.equals("C")) {
            display.setText("0");
            firstNumber = 0;
            operator = "";
            newNumber = true;
            return;
        }

        // Number button
        if (input.matches("[0-9]")) {
            if (newNumber || display.getText().equals("Error")) {
                display.setText(input);
                newNumber = false;
            } else {
                display.setText(display.getText() + input);
            }
            return;
        }

        // Operator button
        if (input.matches("[+\\-*/]")) {
            firstNumber = Double.parseDouble(display.getText());
            operator = input;
            newNumber = true;
            return;
        }

        // Equals button
        if (input.equals("=")) {
            if (operator.isEmpty()) {
                return;
            }

            double secondNumber =
                Double.parseDouble(display.getText());

            double result;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        display.setText("Error");
                        operator = "";
                        newNumber = true;
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    return;
            }

            if (Double.isFinite(result)) {
                display.setText(
                    result == Math.floor(result)
                        && Math.abs(result) < 1e15
                        ? String.format("%.0f", result)
                        : Double.toString(result)
                );
            } else {
                display.setText("Error");
            }

            operator = "";
            newNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}
