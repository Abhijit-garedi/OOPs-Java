import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Create components
        JLabel label1 = new JLabel("Number 1:");
        JTextField text1 = new JTextField();

        JLabel label2 = new JLabel("Number 2:");
        JTextField text2 = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultText = new JTextField();
        resultText.setEditable(false); // Make result field read-only

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");

        // Add action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                resultText.setText(String.valueOf(num1 + num2));
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                resultText.setText(String.valueOf(num1 - num2));
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                resultText.setText(String.valueOf(num1 * num2));
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                if (num2 != 0) {
                    resultText.setText(String.valueOf(num1 / num2));
                } else {
                    resultText.setText("Error: Division by zero");
                }
            }
        });

        // Add components to the frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(resultLabel);
        frame.add(resultText);

        // Set frame visibility
        frame.setVisible(true);
    }
}
