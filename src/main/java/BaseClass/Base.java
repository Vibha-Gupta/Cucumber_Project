package BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class Base {
	
	protected static WebDriver driver;
	public static Properties CONFIG;
	public static Properties OR;
	
	public void initializationMethod() throws Exception
	{
		System.out.println("Executing initialization method");
		
		CONFIG = new Properties();
		FileInputStream CONFIG_FIS = new FileInputStream(System.getProperty("user.dir")+"/CONFIG.properties");
		CONFIG.load(CONFIG_FIS);
		
		OR = new Properties();
		FileInputStream OR_FIS = new FileInputStream(System.getProperty("user.dir")+"/OR.properties");
		OR.load(OR_FIS);	
	}
	
//	public String getReportConfigPath(){
//		String reportConfigPath = CONFIG.getProperty("reportConfigPath");
//		if(reportConfigPath!= null) {
//			return reportConfigPath;
//		}
//		else
//		{
//			throw new RuntimeException("Report Config Path not specified in the CONFIG.properties file for the Key:reportConfigPath");
//		}
					
}	
		
