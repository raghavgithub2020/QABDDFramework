package utils;

public class Constant {

	/**Config Properties file **/
	public final static String CONFIG_PROPERTIES_DIRECTORY = "properties/config.properties";
	
	public final static String GECKO_DRIVER_DIRECTORY = System.getProperty(("user.other"), "/geckodriver");
	
	public final static String CHROME_DRIVER_DIRECTORY = System.getProperty("/usr/local/bin/chromedriver");
	
	public final static String IE_DRIVER_DIRECTORY = System.getProperty(("user.other") + "/IEDriverServer");
}
