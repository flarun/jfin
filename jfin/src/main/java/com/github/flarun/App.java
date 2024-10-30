package com.github.flarun;

import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling classes

/**
 * Easiest possible GUI App with Swing
 */
public class App {
     public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(300, 200); // Set the size of the window

        // Create a label
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.add(label); // Add label to the frame

        // Create a button
        JButton button = new JButton("Click Me!");
        frame.add(button, "South"); // Add button to the bottom of the frame

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // Change label text on button click
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

