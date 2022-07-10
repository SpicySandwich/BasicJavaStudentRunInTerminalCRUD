package Student.Input;

import java.util.Scanner;

import Student.Service.LoginLogic;
import Student.Service.StudentLogic;

public class InputChoice {
	
	Scanner scanner = new Scanner(System.in);
	
	public void returnChoice() {
		
		
		StudentLogic studentLogic = new StudentLogic();
		
		System.out.print("\n\nStudent Info\n\nEnter: [find] [list] [delete] [update] [add] [logout]\n\nChoose a function: ");
		 String choice = scanner.nextLine();
		 String id = null;
		 
			switch (choice.toLowerCase()) {
				case "find":
					studentLogic.findbyid();
					returnChoice();
				case "list":
					studentLogic.List();
					returnChoice();
				case "delete":
					studentLogic.deletebyid();
					returnChoice();
				case "update":
					studentLogic.updatebyid();
					returnChoice();
				case "add":
					studentLogic.createdata();;
					returnChoice();
				case "logout":
					logout();
				default:
					wrongChoice(choice);
			}
			
			scanner.close();
			
	}
	
	public void returnLlogin() {
		
		LoginLogic logic = new LoginLogic();
		System.out.print("Welcome\n\nEnter: [login] [add] [update] [delete] [logout]\n\nPlease choose: ");
		String choice = scanner.nextLine();
		
		switch (choice.toLowerCase()) {
			
			
			case "login":
				logic.login();
				returnLlogin();
				
			case "add":
				logic.addLoginUser();
				returnLlogin();
				
			case "update":
				logic.updateLoginUser();
				returnLlogin();
				
			case "delete":
				logic.deleteLoginUser();;
				returnLlogin();
				
			case "logout":
				logout();
			
			default:
				wrongInputLogin(choice);
		}
		
		scanner.close();
		
	}
	
	public void wrongChoice(String string) {
		
		System.err.println("Invalid "+string+" please input again...");
		returnChoice();
	}
	
	public void wrongInputLogin(String string) {
		
		System.err.println("Invalid "+string+" please input again...");
		returnLlogin();
		
	}
	
	public void logout() {
		
		System.out.println("\nSuccesfully logout\n");
		System.exit(0);
		
		
		
		
		
	}

}
