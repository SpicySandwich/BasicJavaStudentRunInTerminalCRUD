package Student.Validation;

import Student.Input.InputChoice;


public class StudentValidation {

	InputChoice inputChoice = new InputChoice();
	

	
	public String checkString(String name) {
		
	if (name.isEmpty() || name == null) {
		System.err.println("\nUnsuccessful Name is Empty\n");
		 inputChoice.returnChoice();
	}return name;
	
	}

	public Integer checkage(Integer age) {
		
	
	if (null == age || age == 0) {
		System.err.println("\nUnsuccessful Age Error\n");
		 inputChoice.returnChoice();
	}else if(age <= 17) {
		System.err.println("\nUnsuccessful Under Age\n");
		 inputChoice.returnChoice();
	} return age;
	
	}

	public Integer checkid(Integer id) {
		
		if (null == id || id == 0) {
			System.err.println("\nUnsuccessful Id: "+id+" not found\"\n");
			 inputChoice.returnChoice();
		} return id;
		
	}
	
    
	
	
	
	
	

}
