package mygui;

import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {
        // Create a new JFrame object
        JFrame frame = new JFrame();

        // Create a new button
        JButton button = new JButton("Click Me");

        // Add the button to the JFrame object
        frame.add(button);

        // Set the JFrame object's properties
        frame.setTitle("My GUI");
        frame.setSize(300, 200);

        // Make the JFrame object visible
        frame.setVisible(true);
    }
}