package Student.Converter;

public class Convert {
	
	public String convert(String string) {
		
		if (string == null || string.trim().isEmpty() || !string.matches("[0-9]+")) {
			
			return "0";
		}
		return string;
		
	}

}
