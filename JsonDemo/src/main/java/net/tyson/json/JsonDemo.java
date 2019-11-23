package net.tyson.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class JsonDemo {
	
	@SuppressWarnings("unchecked")
	public static void jsonWrite() {
		JSONObject obj = new JSONObject();
		obj.put("firstName", "Tyson");
        obj.put("lastName", "Taylor"); 
    	    	
              
        //This will write the students to the students.json file. 
        try (FileWriter file = new FileWriter("student.json")) {
            file.write(obj.toString());
            file.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
	}
	
	
	public static void jsonRead() {
		JSONParser parser = new JSONParser();
		
		
		
		try {
			Object obj = parser.parse(new FileReader("students.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String firstName = (String) jsonObject.get("firstName");
			System.out.println(firstName);
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}
		   
	public static void main( String[] args ) {
		jsonWrite();
		jsonRead();
    }
}