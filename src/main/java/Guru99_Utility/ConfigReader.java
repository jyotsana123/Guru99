package Guru99_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader()
	{
		
		prop = new Properties();
		try
		{ 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

	public String getProperties(String key) {
		return prop.getProperty(key);
	}

}
