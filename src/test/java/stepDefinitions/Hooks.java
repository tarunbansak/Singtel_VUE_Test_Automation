package stepDefinitions;

import Utilities.Driver;
import io.cucumber.java.After;

public class Hooks extends Driver{
	
	// *****************************************************************************************
	// * Name : afterScenarioQuitDriver
	// * Description : This function is used to close the driver instance for every scenario at the end
	// * Author : Tarun Bansal
	// * Input Params : Null
	// * Return Values: Null
	// * Date : 01/04/2022
	// * Modify Date :
	// *****************************************************************************************

	@After
	public void afterScenarioQuitDriver(){
		if(driver!=null){
			driver.quit();
		}
	}
}


