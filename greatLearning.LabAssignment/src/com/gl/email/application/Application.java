package com.gl.email.application;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.Credentialservice;

public class Application {
	
	public static void Main(String[] args) {
	
		Employee employee = new Employee("Shiv Kumar " , "Singh");
		Credentialservice cs = new Credentialservice();
		
		String generatedEmail;
		char[] generatedPassword;
		
	System.out.println("Please enter the Department from the following ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resorce");
	System.out.println("4. Legal");
	
	var sc = new Scanner (System.in);
	int input = sc.nextInt();
	
	switch(input) {
	
	case 1: { 
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getFirstName(),"tech");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;
		
			}
	case 2:{ 
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getFirstName(),"adm");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;
		
			}
	case 3:{ 
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getFirstName(),"HR") ;
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;
		
			}
	case 4:{ 
		generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getFirstName(),"Legal") ;
		generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
		break;
			}
	}
		
		
	}

}
