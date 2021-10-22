package Demo;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;


	
public class ReadDataFromJsonfile1 {
	
	@Test
	public void getDataFromJson() throws Throwable{

  // Read the data from json file
	FileReader file=new FileReader("./Data/CommonData.json");
	//convert json file into java object
	JSONParser jsonobj=new JSONParser();
	Object jobj=jsonobj.parse(file);
	
	//type cast java ob to hashmap
	HashMap map=(HashMap)jobj;
	String USERNAME=map.get("username").toString();
	System.out.println(USERNAME);
	String PASSWORD=map.get("password").toString();
	System.out.println(PASSWORD);
	String url=map.get("url").toString();
	System.out.println(url);

	}
}
