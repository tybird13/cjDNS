package cjDNSInterface;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class AddNewUserPrompt implements ActionListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Would you like to add a new user, or display an existing user's passkey?");
	JButton addUserButton = new JButton("Add New User");
	JButton displayUserKeyButton = new JButton("Display User Key");


	AddNewUserPrompt() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setSize(800,  200);
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		addUserButton.setHorizontalAlignment(SwingConstants.CENTER);
		displayUserKeyButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel vPanel = new JPanel();
		vPanel.setLayout(new BoxLayout(vPanel, BoxLayout.PAGE_AXIS));
		vPanel.add(Box.createVerticalStrut(30));
		vPanel.add(label);
		vPanel.add(Box.createVerticalStrut(10));
		
		JPanel hPanel = new JPanel();
		hPanel.setLayout(new BoxLayout(hPanel, BoxLayout.LINE_AXIS));
		hPanel.setAlignmentX(0);
		hPanel.add(Box.createHorizontalStrut(30));
		hPanel.add(addUserButton);
		hPanel.add(Box.createHorizontalStrut(10));
		hPanel.add(displayUserKeyButton);
		hPanel.add(Box.createVerticalStrut(30));
		
		hPanel.setAlignmentX(SwingConstants.CENTER);
		
		vPanel.add(hPanel);
		vPanel.setAlignmentX(SwingConstants.CENTER);
		
		
		//frame.add(vPanel, BorderLayout.CENTER);
		frame.add(vPanel);
		System.out.println(label.getText());
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}