package Student;

import java.util.Scanner;

public class InputChoice {
	
	public void returnChoice() {
		
		Scanner scanner = new Scanner(System.in);
		StudentLogic studentLogic = new StudentLogic();
		
		System.out.print("Choose a function: ");
		 String choice = scanner.nextLine();
		 String id = null;
		 
			switch (choice.toLowerCase()) {
				case "find":
					studentLogic.findbyid(id);
					returnChoice();
				case "list":
					studentLogic.List();
					returnChoice();
				case "delete":
					studentLogic.deletebyid(id);
					returnChoice();
				case "update":
					studentLogic.updatebyid(id);
					returnChoice();
				case "add":
					studentLogic.createdata(id);;
					returnChoice();
				default:
					wrongChoice(choice);
			}
			
			scanner.close();
			
	}
	
	public void wrongChoice(String string) {
		
		System.err.println("Invalid "+string+" please input again...");
		returnChoice();
	}

}
