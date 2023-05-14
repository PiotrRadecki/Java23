import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
    private double firstNumber = 0.0;
    private char operation = ' ';

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        buttons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();

        if (buttonLabel.equals("C")) {
            display.setText("");
        } else if (buttonLabel.equals("+")) {
            firstNumber = Double.parseDouble(display.getText());
            operation = '+';
            display.setText("");
        } else if (buttonLabel.equals("-")) {
            firstNumber = Double.parseDouble(display.getText());
            operation = '-';
            display.setText("");
        } else if (buttonLabel.equals("*")) {
            firstNumber = Double.parseDouble(display.getText());
            operation = '*';
            display.setText("");
        } else if (buttonLabel.equals("/")) {
            firstNumber = Double.parseDouble(display.getText());
            operation = '/';
            display.setText("");
        } else if (buttonLabel.equals("=")) {
            double secondNumber = Double.parseDouble(display.getText());
            double result = 0.0;

            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
            }

            display.setText(Double.toString(result));
        } else {
            display.setText(display.getText() + buttonLabel);
        }
    }

}
