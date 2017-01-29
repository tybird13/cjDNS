package cjDNSInterface;

import java.io.IOException;
import java.util.Scanner;

/*
 * Author: Tyler Dalbora
 * Purpose: This program was created for a friend in order to render a UI for 
 *          his network infrastructure as part of the FGCU Runway Program. 
 *          This program is intended to provide a UI to the cjdns program in 
 *          order to prompt users with their unique INbound IDs
 * 
 * Created Date: 01/28/2017
 * Note:    This program does not employ the javafxml MVC paradigm. 
 * GIT:		HTTPS://github.com/tybird13/cjDNS
 * 
 */
public class CJDNSMain{
	// /home/tyler/Desktop/cjdroute_copy.conf

	public static void main(String[] args) {
		
		CjdnsInterfaceObject cjdns;	// config file manager object
		//Scanner in = new Scanner(System.in);
		
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

}
