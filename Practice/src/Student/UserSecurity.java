package Student;

import java.util.Scanner;

public class UserSecurity {
	
	ExceptionCatcher running = new ExceptionCatcher();
	static Scanner scanner = new Scanner(System.in);
	
	public void userAndPass() {
		
		Integer tryLimit = 4;
		Integer countTry = 0;
		boolean valid = true;
		
		
		do {
			
			System.out.print("\nEnter username: ");
			String username = scanner.nextLine();
			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			
			if (username.contains("conred") == valid && password.contains("1234")) {
				runningApp();
				break;
			}else 
				System.err.print("\nAttempt "+ ++countTry +": Try Again\n");
			
			tryLimit--;
			
			
		} while (tryLimit > 0);
		
		
		
		if (tryLimit == 0) System.err.println("Application is now locked");
	}
	
	public void runningApp() {
		
		running.run();
	}

}