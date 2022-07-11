package Student.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Student.Converter.Convert;
import Student.DAO.StudentDataUtil;
import Student.Entity.StudentEntity;
import Student.Input.InputChoice;
import Student.Validation.StudentValidation;

public class StudentService {
	
	StudentEntity studentEntity = new StudentEntity();
	StudentValidation studentValidation = new StudentValidation();
	InputChoice inputChoice = new InputChoice();
	static Scanner scanner = new Scanner(System.in);
	static StudentDataUtil dataUtil = new StudentDataUtil();
	static Convert convert = new Convert();


	

	public void findbyid() {

		System.out.print("Find by id: ");
		String idstring = scanner.nextLine();
		checkidnotpresent(studentValidation.checkString(idstring));
		Integer id = Integer.parseInt(convert.convert(idstring));
		dataUtil.getInfoById(studentValidation.checkid(id));
	}
	
	public void List() {
		dataUtil.ListInfo();	
	}
	
	
	public void deletebyid() {
		
		System.out.print("Delete by id: ");
		String idstring = scanner.nextLine();
		checkidnotpresent(studentValidation.checkString(idstring));
		Integer id = Integer.parseInt(convert.convert(idstring));
		dataUtil.deleteById(studentValidation.checkid(id));
		System.out.println("Succefulley Delete id : "+ id);
	}
	
	public void updatebyid() {
		
		System.out.print("update by id: ");
		String idstring = scanner.nextLine();
		checkidnotpresentUpdate(studentValidation.checkString(idstring));
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Age: ");
		String age = scanner.nextLine();
		
		System.out.print("Course: ");
		String course = scanner.nextLine();
		
		int insertSubject = 4;
	    int countSubject = 0;
	    
	    List<String> strings = new ArrayList<String>();
	    
	    System.out.print("\nSubject List: [ITF] [P] [DS] [CO] [M] [S] [E]\n");
	     do {
	    	 System.out.print( ++countSubject + ": Enter Subject: ");
	    	 String subject = scanner.nextLine().toUpperCase();
	    	 strings.add(subject);
	    	 insertSubject--;
		
	     } while (insertSubject > 0);   
			
		
		
		if(insertSubject == 0)System.out.println("Subject is 4 max only");
		
		
		
		Integer id = Integer.parseInt(convert.convert(idstring));
		Integer age2 = Integer.parseInt(convert.convert(age));
		
		dataUtil.updateById(
				studentValidation.checkid(id),
				studentValidation.checkString(name),
				studentValidation.checkage(age2),
				course,
				strings
				);
		System.out.println("Succefully update id:"+id);
	}
	
	public void createdata() {

		System.out.print("create id: ");
		String idstring = scanner.nextLine();
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Age: ");
		String age = scanner.nextLine();
		checkidpresent(studentValidation.checkString(idstring));
		System.out.print("\nCourse List: [BSIT] [BSA] [BSCE] [BSTM]\nCourse: ");
		String course = scanner.nextLine();

		
		   int insertSubject = 4;
		    int countSubject = 0;
		    
		    List<String> strings = new ArrayList<String>();
		    System.out.print("\nSubject List: [ITF] [P] [DS] [CO] [M] [S] [E]\nMust have 4 Subject\n");
		     do {
		    	 System.out.print( ++countSubject + ": Enter Subject: ");
		    	 String subject = scanner.nextLine().toUpperCase();
		    	 strings.add(subject);
		    	 insertSubject--;
			
		     } while (insertSubject > 0);   

			
			if(insertSubject == 0)System.out.println("Subject is 4 max only");
			
			
	
		
		Integer id = Integer.parseInt(convert.convert(idstring));
		Integer age2 = Integer.parseInt(convert.convert(age));
		
	
		
		dataUtil.createdata(
				studentValidation.checkid(id), 
				studentValidation.checkString(name),
				studentValidation.checkage(age2),
				course,
				strings
				);
		System.out.println("Succefully created data with id:"+id);
	}
	
	 public boolean checkidnotpresent(String idstring) {
		 boolean valid = true;
			Integer id = Integer.parseInt(convert.convert(idstring));
			if (dataUtil.checkidexist(id) == false) {
				System.err.println("\nID: "+ id +" not found or not exist");
				inputChoice.returnChoice();
			} 
			return valid;
				
		}
	 public void checkidpresent(String idstring) {
			Integer id = Integer.parseInt(convert.convert(idstring));
			if (dataUtil.checkidexist(id) == true) {
				System.err.println("\nID: "+ id +" is exist cannot be created. Input another ID..");
				inputChoice.returnChoice();
			} 
				
		}
	 
	 public boolean checkidnotpresentUpdate(String idstring) {
        
		 boolean valid = true;
			Integer id = Integer.parseInt(convert.convert(idstring));
			if (dataUtil.checkidexist(id) == false) {
				System.err.println("\nID: "+ id +" not found or not exist to be updated");
				inputChoice.returnChoice();
				
			} 
			return valid;
				
		}
	 
	 
		
	
	
}
