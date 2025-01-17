import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearningProgram {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Efficiency Training Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 350);
        frame.setLayout(null);

        // Lighter shade of blue
        Color lightBlue = new Color(173, 216, 230);

        // Button to learn about algorithms
        JButton learnAlgorithmsButton = new JButton("Do you want to learn about algorithms?");
        learnAlgorithmsButton.setBounds(50, 50, 450, 50);
        learnAlgorithmsButton.setBackground(lightBlue);
        learnAlgorithmsButton.setForeground(Color.BLACK);
        frame.add(learnAlgorithmsButton);

        // Button to learn about data types
        JButton learnDataTypesButton = new JButton("Or do you want to learn which data types you should use primarily?");
        learnDataTypesButton.setBounds(50, 120, 450, 50);
        learnDataTypesButton.setBackground(lightBlue);
        learnDataTypesButton.setForeground(Color.BLACK);
        frame.add(learnDataTypesButton);

        // Add action listeners to the buttons
        learnAlgorithmsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teachAlgorithms();
            }
        });

        learnDataTypesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teachDataTypes();
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }

    private static void teachAlgorithms() {
        // Placeholder for teaching algorithms
        JOptionPane.showMessageDialog(null, "Here's where you'd learn about algorithms!");
    }

    private static void teachDataTypes() {
        // Placeholder for teaching data types
        JOptionPane.showMessageDialog(null, "Here's where you'd learn about data types!");
    }
}
