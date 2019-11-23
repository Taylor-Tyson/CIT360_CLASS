package net.tyson.json;

import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class JsonWrite {
    @SuppressWarnings("unchecked")
	public static void main( String[] args ) {
    	JSONObject student = new JSONObject();
    	JSONObject student2 = new JSONObject();
    	JSONObject studentObj = new JSONObject();
    	JSONObject studentObj2 = new JSONObject();
    	JSONArray students = new JSONArray();    	
        
        student.put("firstName", "Tyson");
        student.put("lastName", "Taylor");    
        
        student2.put("firstName", "Rachelle");
        student2.put("lastName", "Taylor");
         
        studentObj.put("student", student);
        studentObj2.put("student", student2);                
        
        students.add(student);
        students.add(student2);
         
        //This will write the students to the students.json file. 
        try (FileWriter file = new FileWriter("students.json")) {
            file.write(students.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}