package Student.Validation;

import Student.Entity.LoginEntity;
import Student.ModelException.NotMatch;

public class LoginValidation {
	

	
	
	public void checklogin(LoginEntity loginEntity,String username,String password) {
		
	
		 
		 if (!loginEntity.getUsername().equals(username) && !loginEntity.getPassword().equals(password)) 
			 throw new NotMatch("\nWrong password and username");
		
	}
	
	
	

}