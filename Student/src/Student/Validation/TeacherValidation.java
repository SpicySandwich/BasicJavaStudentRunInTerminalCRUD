package Student.Validation;

import Student.DAO.TeacherDataUtil;
import Student.Entity.TeacherEntity;

public class TeacherValidation {
	
	
	public boolean checkpassword(String username,String password) {
		

		 TeacherDataUtil loginUtil = new TeacherDataUtil();
		 
	
		TeacherEntity loginEntity =loginUtil.checkforlogin(username);
		 
		 
		 if ( 
				 !loginEntity.getPassword().equals(password) || 
				 !loginEntity.getUsername().equals(username) || 
				 loginEntity.getUsername().trim().isEmpty() ||
		         loginEntity.getPassword().trim().isEmpty()) 
		  {
			 System.err.println("\nWrong password or Username\n");
			 return false;
		 }else return true;

		
	}
	

	public void locked(Integer trylimits) {
		if (trylimits == 0) System.err.println("Application is now locked");
	}
	
	public void coutAttempt(Integer countTry) {
		
		if (countTry == 0) {
			EndAttempt();	
		}else {
			System.err.print("\nRemaining attempt "+ countTry +": Try Again\n\n");
		}
		

	}
	
public void EndAttempt() {
	
		System.err.println("\n------------No more Attempt-----------\n\n--------------Auto logout------------");
		
		System.exit(0);
	
		
	}
	
	
	

}
