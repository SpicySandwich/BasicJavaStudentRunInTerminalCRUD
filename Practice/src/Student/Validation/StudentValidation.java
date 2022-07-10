package Student.Validation;

import Student.Input.InputChoice;
import Student.ModelException.AgeErrorhandling;
import Student.ModelException.NameErrorHandling;
import Student.ModelException.findbyidError;

public class StudentValidation implements validationInterface{

	InputChoice inputChoice = new InputChoice();

	@Override
	public String checkname(String name) {
		
	if (name.isEmpty() || name == null) throw new NameErrorHandling("Name Error");
		
		return name;
	}

	@Override
	public Integer checkage(Integer age) {
		
	
	if (null == age || age == 0) throw new AgeErrorhandling("Age Error");
		
	else if(age <= 17) throw new AgeErrorhandling("Under Age");
		
		return age;
	}

	@Override
	public Integer checkid(Integer id) {
		
		if (null == id || id == 0) throw new findbyidError("Id not found");

	    
		return id;
		
	}
	
    
	
	
	
	
	

}
