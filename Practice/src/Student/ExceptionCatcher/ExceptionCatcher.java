package Student.ExceptionCatcher;

import Student.Input.InputChoice;
import Student.ModelException.AgeErrorhandling;
import Student.ModelException.NameErrorHandling;
import Student.ModelException.NotMatch;
import Student.ModelException.findbyidError;

public class ExceptionCatcher {
	
	public void run() {
		
    	   InputChoice inputChoice = new InputChoice();
   		
   		try {
   			inputChoice.returnLlogin();
   	
   		} catch (findbyidError e) {
   			System.out.println(e.getMessage().toString());
   			run(); 
   			
   		} catch (AgeErrorhandling e) {
   			System.out.println(e.getMessage().toString());
   			 run();
   		} catch (NameErrorHandling e) {
   			System.out.println(e.getMessage().toString());
   			run();	
   			
   		}catch (NotMatch e) {
   			System.out.println(e.getMessage().toString());
   			run();	
		}
   		
   		catch (Exception e) {
   			System.out.println(e.getMessage().toString());
   			run();
   			
   		}
	
 
		
      
		
	}

}
