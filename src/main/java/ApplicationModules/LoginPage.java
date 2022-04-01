package ApplicationModules;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Utilities.Driver;
import Utilities.FileSpecificUtilities;


public class LoginPage extends Driver{
	public static Properties prop = null;

	String ToDoEditBox = "//input[@class='new-todo']";

	// *****************************************************************************************
	// * Name : LoginVUE
	// * Description : This function is used to login to VUE application
	// * Author : Tarun Bansal
	// * Input Params : property file name where details are stored
	// * Return Values: Null
	// * Date : 01/04/2022
	// * Modify Date :
	// *****************************************************************************************

	public void LoginVUE(String propFileName) throws IOException, InterruptedException {

		//Reading property file
		prop = FileSpecificUtilities.readPropertyFile(propFileName);
		String DriverType = prop.getProperty("browser");
		String Url = prop.getProperty("URL");

		//Driver initialize
		initializeDriver(DriverType);

		//Entering url
		driver.get(Url);
		Thread.sleep(1000);

		if (driver.findElement(By.xpath(ToDoEditBox)).isDisplayed()){
			ExtentCucumberAdapter.addTestStepLog("User is logged in successfuly.");
		}
		else{
			ExtentCucumberAdapter.addTestStepLog("User is not logged in successfuly.");
			Assert.assertTrue(false);
		}

	}

}
