package Student;

public class ExceptionCatcher {
	
	public void run() {
		
    	   InputChoice inputChoice = new InputChoice();
   		
   		try {
   			inputChoice.returnChoice();	
   	
   		} catch (findbyidError e) {
   			System.out.println(e.getMessage().toString());
   			run(); 
   			
   		} catch (AgeErrorhandling e) {
   			System.out.println(e.getMessage().toString());
   			 run();
   		} catch (NameErrorHandling e) {
   			System.out.println(e.getMessage().toString());
   			run();	
   			
   		}
   		
   		catch (Exception e) {
   			System.out.println(e.getMessage().toString());
   			run();
   			
   		}
	
 
		
      
		
	}

}
