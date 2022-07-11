package Student.ExceptionCatcher;

import Student.Input.InputChoice;


public class ExceptionCatcher {
	
	public void run() {
		
    	   InputChoice inputChoice = new InputChoice();
   		
   		try {
   			inputChoice.returnTeacher();

   		}catch (Throwable e) {
   			System.out.println(e.getMessage().toString());
   			
   			
   		}

		
	}

}
