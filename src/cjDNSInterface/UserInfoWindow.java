package cjDNSInterface;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserInfoWindow {

	
	JFrame frame = new JFrame("cjDNS");
	JPanel containerPanel = new JPanel();
	JPanel passUserInfoPanel = new JPanel();
	JLabel userNameLabel = new JLabel("Please Enter UserName:");
	JTextField userNameField = new JTextField();
	JPanel vPanel = new JPanel();
	JButton userNameSubmitButton = new JButton("Submit");

	
	
	UserInfoWindow(){
		
		// set up frame attributes
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setAutoRequestFocus(true);
		frame.setSize(500, 300);
		
		containerPanel.setLayout(new BorderLayout());
		passUserInfoPanel.setLayout(new BoxLayout(passUserInfoPanel, BoxLayout.LINE_AXIS));
		
		passUserInfoPanel.add(Box.createHorizontalStrut(30));
		passUserInfoPanel.add(userNameLabel);
		passUserInfoPanel.add(Box.createHorizontalStrut(10));
		passUserInfoPanel.add(userNameField);
		passUserInfoPanel.add(Box.createHorizontalStrut(10));
		passUserInfoPanel.add(userNameSubmitButton);
		passUserInfoPanel.add(Box.createHorizontalStrut(30));
	
	
		vPanel.setLayout(new BoxLayout(vPanel, BoxLayout.PAGE_AXIS));
		vPanel.add(Box.createVerticalStrut(30));
		vPanel.add(passUserInfoPanel);
		containerPanel.add(vPanel, BorderLayout.NORTH);
		frame.add(containerPanel);
	
	}

	
}
