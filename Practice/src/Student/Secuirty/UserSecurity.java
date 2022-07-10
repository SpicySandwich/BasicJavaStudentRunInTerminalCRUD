package Student.Secuirty;

import java.util.Scanner;

import Student.ExceptionCatcher.ExceptionCatcher;

public class UserSecurity {
	
	ExceptionCatcher running = new ExceptionCatcher();
	static Scanner scanner = new Scanner(System.in);
	
	public void userAndPass() {
		
		Integer tryLimit = 4;
		Integer countTry = 4;
		boolean valid = true;
		
		
		do {
			
			System.out.print("\nEnter username: ");
			String username = scanner.nextLine();
			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			
			if (username.contains("conred") == valid && password.contains("1234")) {
				System.err.println("\nSuccesfully Login\n");
				runningApp();
				break;
			}else coutAttempt(--countTry);
	
			tryLimit--;
			
		} while (tryLimit > 0);
		
		locked(tryLimit);
		
	}
	
	public void runningApp() {
		running.run();
	}
	
	public void locked(Integer trylimits) {
		if (trylimits == 0) System.err.println("Application is now locked");
	}
	
	public void coutAttempt(Integer countTry) {
		
		if (countTry == 0) {
			EndAttempt();	
		}else {
			System.err.print("\nRemaining attempt "+countTry +": Try Again\n");
		}

	}
	
	
	public void EndAttempt() {
		
		System.err.println("\nNo more Attempt");
	
		
	}

}
