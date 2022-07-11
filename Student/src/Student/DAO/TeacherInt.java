package Student.DAO;




import java.util.Map;

import Student.Entity.TeacherEntity;

public interface TeacherInt {
	
	
	public Map<String, TeacherEntity> datas() ;
	
	public void updateLogin(String key, String username,String password);
	public void addlogin(String key, String username,String password);
	public void deletelogin(String key);
	public boolean checkidexist(String key);
	public TeacherEntity checkforlogin(String key);
	
	

}
