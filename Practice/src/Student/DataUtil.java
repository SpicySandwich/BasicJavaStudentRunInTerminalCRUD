package Student;

import java.util.HashMap;
import java.util.Map;

public class DataUtil {
	
	HashMap<Integer, StudentEntity> sMap = (HashMap<Integer, StudentEntity>) datas();
	
	public static Map<Integer, StudentEntity> datas(){
	 Map<Integer, StudentEntity> sMap = new HashMap<>();
		 
		sMap.put(1, new StudentEntity("Conred",27));
		sMap.put(2, new StudentEntity("Batman",28));
		sMap.put(3, new StudentEntity("Superman",14));
		sMap.put(4, new StudentEntity("Joker",16));
		sMap.put(5, new StudentEntity("Alas-as",39));
	
		
		return sMap;
		
	}
	
	public void getInfoById(Integer id) {
		System.out.println(sMap.get(id));
		
	}
	
	public void ListInfo() {
		for(Map.Entry datamap: sMap.entrySet()) {
			System.out.println(datamap.getKey()+" : "+ datamap.getValue());
		}
	}
	
	public void deleteById(Integer id) {
		sMap.remove(id);
		 
	}
	
	public void updateById(Integer id,String name, Integer age) {
		sMap.replace(id, new StudentEntity(name,age));
		
	}
	
	public void createdata(Integer id,String name, Integer age) {
		sMap.put(id, new StudentEntity(name,age));
		
	}
	
	public boolean checkidexist(Integer id) {
		boolean valid = true;
		 if (sMap.containsKey(id) == valid)return valid;
		 else return false;
	
	}
	

}
