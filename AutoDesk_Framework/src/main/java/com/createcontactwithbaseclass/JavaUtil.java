package com.createcontactwithbaseclass;

import java.util.Date;

public class JavaUtil {
	
	public static String getSystemDate()
	{
		Date date=new Date();
		
		return date.toString().replace(" ", "_").replace(":", "_");
	}

}
