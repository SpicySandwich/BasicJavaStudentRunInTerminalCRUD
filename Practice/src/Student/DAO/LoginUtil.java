package Student.DAO;

import java.util.HashMap;
import java.util.Map;

import Student.Entity.LoginEntity;

public class LoginUtil {
	
	   HashMap<String, LoginEntity> sMap = (HashMap<String, LoginEntity>) datas();

	public static Map<String, LoginEntity> datas() {
		 Map<String, LoginEntity> sMap2 = new HashMap<>();
		sMap2.put("conred", new LoginEntity("conred","1234"));
		sMap2.put("batman", new LoginEntity("batman","1234"));
		sMap2.put("superman", new LoginEntity("superman","1234"));
		
		
		
		return sMap2;
	}
	
	
	public void updateLogin(String key, String username,String password) {
		
		sMap.replace(key, new LoginEntity(username,password));
	}
	
	public void addlogin(String key, String username,String password) {
		
		sMap.put(key, new LoginEntity(username,password));
	}
	
	public void deletelogin(String key) {
		sMap.remove(key);
	}
	
	public boolean checkidexist(String key) {
		boolean valid = true;
		 if (sMap.containsKey(key) == valid)return valid;
		 else return false;
	
	}
	
	
	public LoginEntity checkforlogin(String key) {
		LoginEntity loginEntity = sMap.get(key);
		
		return loginEntity;
	}
	
	
}