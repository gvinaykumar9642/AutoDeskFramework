package Demo;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDataFromJsonFile {
	/**
	 * * this method will return json value based on json key
	 * @param jsonkey
	 * @return jsonvalue
	 * @throws Throwable
	 */
	@Test
	public void getDataFromJson() throws Throwable{
		/*read the data from json file*/
   /* FileReader reader=new FileReader("./Data/CommonData.json");
    //convert json file to java File
    JSONParser parser=new JSONParser();// json is webpage language
    Object object= parser.parse(reader);
    JSONObject jsonObject= (JSONObject)object; //type casting
    String url=jsonObject.get("url").toString();
    String browser=jsonObject.get("browser").toString();
    String username=jsonObject.get("username").toString();
    String password=jsonObject.get("password").toString();
    System.out.println(url);
    System.out.println(browser);
    System.out.println(username);
    System.out.println(password);*/
		
		
		
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


