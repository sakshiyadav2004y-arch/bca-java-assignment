import java.awt.*;
import java.awt.event.*;

public class MyAWTApp extends Frame implements ActionListener {

    // Declare controls
    Label nameLabel;
    TextField nameField;
    Button clickButton;

    // Constructor to setup GUI
    public MyAWTApp() {
        setTitle("AWT Example");          // Set window title
        setLayout(new FlowLayout());       // Set layout manager

        // Initialize controls
        nameLabel = new Label("Enter your name:");
        nameField = new TextField(20);     // TextField with 20 columns
        clickButton = new Button("Click Me");

        // Add controls to frame
        add(nameLabel);
        add(nameField);
        add(clickButton);

        // Add ActionListener to button
        clickButton.addActionListener(this);

        // Set frame size and make it visible
        setSize(300, 150);
        setVisible(true);
    }

    // Handle button click
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();          // Get text from TextField
        System.out.println("Hello, " + name);      // Print to console
    }

    // Main method
    public static void main(String[] args) {
        new MyAWTApp();
    }
}