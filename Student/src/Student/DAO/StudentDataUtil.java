package Student.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Student.Entity.Course;
import Student.Entity.CourseType;
import Student.Entity.StudentEntity;
import Student.Entity.SubjectType;

public class StudentDataUtil implements StudentInt {
	
	HashMap<Integer, StudentEntity> sMap = (HashMap<Integer, StudentEntity>) datas();

	@Override
	public Map<Integer, StudentEntity> datas() {
		 Map<Integer, StudentEntity> sMap2 = new HashMap<>();
		 
		 SubjectType subjectType = null;
		 
		 List< SubjectType > list1 = List.of( subjectType.CO, subjectType.P) ;
		 List< SubjectType > list2 = List.of( subjectType.ITF, subjectType.DS) ;
		 List< SubjectType > list3 = List.of( subjectType.P) ;

			 
			sMap2.put(1, new StudentEntity("Conred",27,new Course(CourseType.BSIT,list3)));
			sMap2.put(2, new StudentEntity("Batman",28,new Course(CourseType.BSCE,list1 )));
			sMap2.put(3, new StudentEntity("Superman",14,new Course(CourseType.BSA,list2)));
			sMap2.put(4, new StudentEntity("Joker",16,new Course(CourseType.BSTM,list2)));
			sMap2.put(5, new StudentEntity("Alas-as",39,new Course(CourseType.BSIT,list1 )));
		
			
			return sMap2;
	}

	@Override
	public void getInfoById(Integer id) {
		System.out.println(sMap.get(id));
		
	}

	@Override
	public void ListInfo() {
		for(Map.Entry datamap: sMap.entrySet()) {
			System.out.println(datamap.getKey()+" : "+ datamap.getValue());
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		sMap.remove(id);
		
	}

	@Override
	public void updateById(Integer id, String name, Integer age, String courseType, List<String> list) {
		sMap.replace(id, new StudentEntity(name,age, new Course(coursemethod(courseType), subjectmethod(list))));
		
	}

	@Override
	public void createdata(Integer id, String name, Integer age, String courseType, List<String> list) {
		sMap.put(id, new StudentEntity(name,age, new Course(coursemethod(courseType), subjectmethod(list))));
		
	}

	@Override
	public boolean checkidexist(Integer id) {
		boolean valid = true;
		 if (sMap.containsKey(id) == valid)return valid;
		 else return false;
	}

	@Override
	public CourseType coursemethod(String courseType) {
		return CourseType.valueOf(courseType);
	}

	@Override
	public List<SubjectType> subjectmethod(List<String> list) {

		List<SubjectType> objectList = new ArrayList<SubjectType>();
		
		
		for(String s : list) {
			
			SubjectType subjectType = Enum.valueOf(SubjectType.class, s);
			objectList.add(subjectType);
		}
	
			
	return objectList;
	}
	

	
	
	
	

}
