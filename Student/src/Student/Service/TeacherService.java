package Student.Service;

import java.util.Scanner;

import Student.DAO.TeacherDataUtil;
import Student.Input.InputChoice;
import Student.Validation.TeacherValidation;

public class TeacherService {
	
	static Scanner scanner = new Scanner(System.in);
	static TeacherDataUtil loginUtil = new TeacherDataUtil();
	static TeacherValidation validation = new TeacherValidation();
	static InputChoice inputChoice = new InputChoice();
	
	
	public void login() {
		
      System.out.println("\nLogin\n");
		
		String username;
		String password;
		
		Integer tryLimit = 4;
		Integer countTry = 4;
		boolean valid = true;

		do {
			
			System.out.print("Enter username: ");
			username = scanner.nextLine();
			System.out.print("Enter password: ");
			password = scanner.nextLine();

			if(validation.checkpassword(username, password) == valid) {
				System.out.println("\nSuccefully login\n\nWelcome teacher "+username+". ");
				inputChoice.returnChoice(); 	
			} 
			else {
				validation.coutAttempt(--countTry);
			}
			 tryLimit--;
			
		} while (tryLimit > 0);
		
		validation.locked(tryLimit);
		
		
	   }
	
	
	
	public void addLoginUser() {
		
		System.out.println("Add User\n");
		
		String key;
		String username;
		String password;
		String passwordverify;
		
		System.out.print("Enter username: ");
		key = scanner.nextLine();
		System.out.print("Verify username: ");
		username = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.nextLine();
		System.out.print("Verify password: ");
		passwordverify = scanner.nextLine();
		
		ifFound(username);
		
		if(!password.equals(passwordverify)) System.err.println("\nPassword not match");
		if(!key.equals(username))System.err.println("\nUsername not match");
		
		loginUtil.addlogin(key, username, password);
		
		
	}
	
    public void updateLoginUser() {
    	
System.out.println("Update User\n");
		
		String key;
		String username;
		String password;
		String passwordverify;
		
		System.out.print("Enter username: ");
		key = scanner.nextLine();
		System.out.print("Verify username: ");
		username = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.nextLine();
		System.out.print("Verify password: ");
		passwordverify = scanner.nextLine();
		
		ifNotFound(username);
		
		
		if(!password.equals(passwordverify)) System.err.println("\nPassword not match");
		if(!key.equals(username))System.err.println("\nUsername not match");
		
    	loginUtil.updateLogin(key, username, password);
		
	}
    
    public void deleteLoginUser() {
    	
    	String key;
		String username;
	
		System.out.print("Enter username: ");
		key = scanner.nextLine();
		System.out.print("Verify username: ");
		username = scanner.nextLine();
		
		if(!key.equals(username))System.err.println("\nUsername not match");
	
    	
    	loginUtil.deletelogin(key);
	}
    
  
    
    public void ifNotFound(String key) {
    
    	if (loginUtil.checkidexist(key) == false) System.err.println("Username: "+ key +" not found or not exist");

    }
    
     public void ifFound(String key) {
    	 if (loginUtil.checkidexist(key) == true) System.err.println("Username: "+ key +" is exist cannot be created. Input another username..");
    	
    }
	
	
	

}
