package cjDNSInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Author: Tyler Dalbora
 * Purpose: This program was created for a friend in order to render a UI for 
 *          his network infrastructure as part of the FGCU Runway Program. 
 *          This program is intended to provide a UI to the cjdns program in 
 *          order to prompt users with their unique INbound IDs
 * 
 * Created Date: 01/28/2017 
 * GIT:		HTTPS://github.com/tybird13/cjDNS
 * 
 */
public class CJDNSMain{
	// /home/tyler/Desktop/cjdroute_copy.conf
	
 
	public static void main(String[] args) {
		// create the user interface

		JFrame frame = new JFrame("cjDNS");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setAutoRequestFocus(true);
		frame.setSize(500, 300);
		
		JPanel containerPanel = new JPanel();
		containerPanel.setLayout(new BorderLayout());
		
		JPanel passUserInfoPanel = new JPanel();
		passUserInfoPanel.setLayout(new BoxLayout(passUserInfoPanel, BoxLayout.LINE_AXIS));
		
		JLabel userNameLabel = new JLabel("Please Enter UserName:");
		JTextField userNameField = new JTextField();
		
		// handle the submission of the user name field
		JButton userNameSubmitButton = new JButton("Submit");
		
		passUserInfoPanel.add(Box.createHorizontalStrut(30));
		passUserInfoPanel.add(userNameLabel);
		passUserInfoPanel.add(Box.createHorizontalStrut(10));
		passUserInfoPanel.add(userNameField);
		passUserInfoPanel.add(Box.createHorizontalStrut(10));
		passUserInfoPanel.add(userNameSubmitButton);
		passUserInfoPanel.add(Box.createHorizontalStrut(30));


		JPanel vPanel = new JPanel();
		vPanel.setLayout(new BoxLayout(vPanel, BoxLayout.PAGE_AXIS));
		vPanel.add(Box.createVerticalStrut(30));
		vPanel.add(passUserInfoPanel);
		containerPanel.add(vPanel, BorderLayout.NORTH);
		frame.add(containerPanel);

	   
	   
		
		
		
		
		CjdnsInterfaceObject cjdns;	// config file manager object
		
		System.out.println("Please enter the full file path to the config file:");
		// String file = in.nextLine();
		// got tired of typing in the file location
		// testing code only
		String file = "/home/tyler/Desktop/cjdroute_copy.conf";
		
		try { 
			cjdns = new CjdnsInterfaceObject(file, "Tyler Dalbora"); // initialize the CjdnsInterfaceObject
			System.out.println(cjdns.accessFile()); // access file contents and create StringBuffer
			
			int i;
			if ((i = cjdns.locateInsertionPoint()) > 0) {
				cjdns.insertEntry(i);
			}
			
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static JPanel JPane(BoxLayout boxLayout) {
		// TODO Auto-generated method stub
		return null;
	}

}
