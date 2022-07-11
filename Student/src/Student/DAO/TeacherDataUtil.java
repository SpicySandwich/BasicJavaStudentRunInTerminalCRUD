package Student.DAO;

import java.util.HashMap;
import java.util.Map;

import Student.Entity.TeacherEntity;

public class TeacherDataUtil implements TeacherInt{
	
	  HashMap<String, TeacherEntity> sMap = (HashMap<String, TeacherEntity>) datas();

	@Override
	public Map<String, TeacherEntity> datas() {
		
		 Map<String, TeacherEntity> sMap2 = new HashMap<>();
			sMap2.put("conred", new TeacherEntity("conred","1234"));
			sMap2.put("batman", new TeacherEntity("batman","1234"));
			sMap2.put("superman", new TeacherEntity("superman","1234"));

			return sMap2;
	}

	@Override
	public void updateLogin(String key, String username, String password) {
		sMap.replace(key, new TeacherEntity(username,password));
		
	}

	@Override
	public void addlogin(String key, String username, String password) {
		sMap.put(key, new TeacherEntity(username,password));
		
	}

	@Override
	public void deletelogin(String key) {
		sMap.remove(key);
		
	}

	@Override
	public boolean checkidexist(String key) {
		boolean valid = true;
		 if (sMap.containsKey(key) == valid)return valid;
		 else return false;
	}

	@Override
	public TeacherEntity checkforlogin(String key) {
		TeacherEntity loginEntity = new TeacherEntity();

		if(checkidexist(key)== false) {
				loginEntity.setUsername("");
				loginEntity.setPassword("");
				return loginEntity;
		}
			loginEntity = sMap.get(key);
		
		return loginEntity;
	}
	
 
	
	
}
