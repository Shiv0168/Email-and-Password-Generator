package com.gl.email.service;
import java.util.Random;

import com.gl.email.model.Employee;

public class Credentialservice {

	public char[] generatePassword() {
		String upperCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialChar = "!@#$%^&*()_+";
		String bigString = upperCaps + lowerCase + number + specialChar;
		Random random = new Random();
		char [] password = new char[8];
		
		for(int i=0; i<8; i++) {
			password[i]=bigString.charAt(random.nextInt(bigString.length()));
		}
		return password;
	}
	

	public String generateEmailAddress (String firstName , String lastName , String Department) {
	   return firstName+lastName+"@"+Department+"greatlearning.com" ;
	
	}
	
	
	public void showCredentials(Employee employee , String email , char[] password) {
		
	  System.out.println("dear "+ employee.getFirstName()+ "Your generated credentials are as follows ");
	  System.out.println("Email: " + email);
	  System.out.println("Password: " + password);
	
	}
}
