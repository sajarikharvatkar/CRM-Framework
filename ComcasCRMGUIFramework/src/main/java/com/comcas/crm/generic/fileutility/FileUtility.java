 package com.comcas.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	//Get data from properties file
	public String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./configAppData/commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
		
	}

}
