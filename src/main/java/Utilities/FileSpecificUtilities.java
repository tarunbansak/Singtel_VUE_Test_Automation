package Utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileSpecificUtilities {

	static Properties prop = null;

	/**	  
	 This method will read Property File from the paths specified
	 @param 
	 	fileName -file to be read
    @return 
    	Properties
    @throws 
    	no exception thrown
	 */

	public static Properties readPropertyFile(String fileName) {

		String currentDir = System.getProperty("user.dir");

		String filePath = currentDir+"//src//test//resources//"+fileName+".properties";

		try (InputStream input = new FileInputStream(filePath)){
			prop = new Properties();
			if (input != null) {
				prop.load(input);

			}			
		} catch (IOException ex) {
			ex.printStackTrace();
		}


		return prop;
	}
}


