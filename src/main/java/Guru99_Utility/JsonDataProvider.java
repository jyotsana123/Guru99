package Guru99_Utility;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.testng.annotations.DataProvider;

public class JsonDataProvider {

	public static Object[][] getData(String fileName) throws IOException
	{
		String path = "src\\main\\java\\resources\\testData//"+fileName;
		String json = new String(Files.readAllBytes(Paths.get(path)));
		JSONArray jsonArray = new JSONArray(json);
		Object[][] data = new Object[jsonArray.length()][1];
		
		for(int i=0;i<jsonArray.length();i++)
		{
			data[i][0]=jsonArray.getJSONObject(i);
		}
		return data;
		
	}
	
	@DataProvider(name="jsonData")
	public Object[][] jsonDataProvider(Method method) throws IOException
	{
		String fileName = method.getName()+".json";
		return getData(fileName);
		
	}
}
