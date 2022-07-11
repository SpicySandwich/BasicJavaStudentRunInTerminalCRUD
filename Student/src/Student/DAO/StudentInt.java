package Student.DAO;

import java.util.List;
import java.util.Map;

import Student.Entity.CourseType;
import Student.Entity.StudentEntity;
import Student.Entity.SubjectType;

public interface StudentInt {
	
	public Map<Integer, StudentEntity> datas();
	public void getInfoById(Integer id);
	public void ListInfo();
	public void deleteById(Integer id);
	public void updateById(Integer id,String name, Integer age,String courseType,List<String>list);
	public void createdata(Integer id,String name, Integer age,String courseType,List<String>list);
	public boolean checkidexist(Integer id);
	public CourseType coursemethod(String courseType);
	public List<SubjectType> subjectmethod(List<String>list);

}
