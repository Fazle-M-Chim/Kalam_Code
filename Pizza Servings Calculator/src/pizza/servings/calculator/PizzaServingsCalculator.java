// Programming Assignment 4 Pizza Servings Calculator
/**
 * Created by Fazlemalak Chimthanawala on 10/01
 * @author fazle
*This is a program used to calculate the monthly payments on loans with varying interest rates and principal
*/
package pizza.servings.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaServingsCalculator extends JFrame {
    private JLabel titleLabel;
    private JLabel pizzaSizeLabel;
    private JTextField pizzaSizeTextField;
    private JButton servingsButton;
    private JLabel noOfPizzaServings;

    public PizzaServingsCalculator() {
        setTitle("Pizza Servings Calculator");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 1));

        // Create and add the title label with a bigger font size (red, centered)
        titleLabel = new JLabel("Pizza Servings Calculator");
        titleLabel.setForeground(Color.RED);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // You can adjust the font size here
        add(titleLabel);

        // Create and add the panel for line 2 components (Enter size label and text field)
        JPanel line2 = new JPanel();
        pizzaSizeLabel = new JLabel("Enter the size of the pizza in inches:");
        pizzaSizeTextField = new JTextField(4);
        line2.add(pizzaSizeLabel);
        line2.add(pizzaSizeTextField);
        add(line2);

        // Create and add the button for calculating servings
        servingsButton = new JButton("Calculate Servings");
        add(servingsButton);

        // Create a panel for line 4 (result) to center-align the servings label
        JPanel line4 = new JPanel();
        line4.setLayout(new BoxLayout(line4, BoxLayout.X_AXIS)); // Center horizontally
        noOfPizzaServings = new JLabel();
        line4.add(Box.createHorizontalGlue()); // Create empty space before label
        line4.add(noOfPizzaServings);
        line4.add(Box.createHorizontalGlue()); // Create empty space after label
        add(line4);

        servingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                try {
                    // Read and calculate the number of servings
                    double pizzaSizeEntered = Double.parseDouble(pizzaSizeTextField.getText());
                    double pizzaSizeTotal = Math.ceil(pizzaSizeEntered);
                    double noOfServings = Math.pow((pizzaSizeTotal / 8), 2);

                    // Set the number of servings into the label and format it to two decimal places
                    noOfPizzaServings.setText("This pizza will serve " + String.format("%.2f", noOfServings) + " people");
                } catch (NumberFormatException e) {
                    // Handle invalid input
                    noOfPizzaServings.setText("Invalid input");
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PizzaServingsCalculator();
            }
        });
    }
}
