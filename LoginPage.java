import javax.swing.*;
import java.awt.*;

public class LoginInterface {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Programming Efficiency Training Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(375, 320);
        frame.setLayout(null);

        // Welcome label
        JLabel welcomeLabel = new JLabel("<html>Welcome to the programming efficiency training program.<br>Please enter your username and password</html>");
        welcomeLabel.setBounds(20, 10, 430, 40);
        frame.add(welcomeLabel);

        // Username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 60, 80, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 60, 165, 25);
        frame.add(usernameField);

        // Password label and text field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 100, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 100, 165, 25);
        frame.add(passwordField);

        // Forgot Password link
        JLabel forgotPasswordLabel = new JLabel("Forgot Password?");
        forgotPasswordLabel.setBounds(100, 130, 120, 25);
        frame.add(forgotPasswordLabel);

        // Status label
        JLabel statusLabel = new JLabel("STATUS OF LOGIN GOES HERE");
        statusLabel.setBounds(85, 180, 430, 25);
        frame.add(statusLabel);

        // Sign Up button
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(50, 230, 100, 25);
        signUpButton.setBackground(Color.BLUE);
        signUpButton.setForeground(Color.WHITE);
        frame.add(signUpButton);

        // Sign In button
        JButton signInButton = new JButton("Sign In");
        signInButton.setBounds(200, 230, 100, 25);
        signInButton.setBackground(Color.BLUE);
        signInButton.setForeground(Color.WHITE);
        frame.add(signInButton);

        // Set frame visibility
        frame.setVisible(true);
    }
}
