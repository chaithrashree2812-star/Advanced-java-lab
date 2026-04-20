package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


	public class ImageButtonDemo {

	    JFrame frame;
	    JLabel messageLabel;

	    ImageButtonDemo() {

	        // Create frame
	        frame = new JFrame("Image Button Demo");
	        frame.setSize(500, 300);
	        frame.setLayout(new FlowLayout());
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Message label
	        messageLabel = new JLabel("Click a button");
	        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

	        // Load images (make sure images are in project folder)
	        ImageIcon clockIcon = new ImageIcon("clock.png");
	        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	        // Create buttons
	        JButton clockButton = new JButton(clockIcon);
	        JButton hourglassButton = new JButton(hourglassIcon);

	        // Add action listeners
	        clockButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        hourglassButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Add components to frame
	        frame.add(messageLabel);
	        frame.add(clockButton);
	        frame.add(hourglassButton);

	        // Make visible
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new ImageButtonDemo();
	            }
	        });
	    }
	}

	