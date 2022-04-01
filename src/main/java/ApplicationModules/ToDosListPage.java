package ApplicationModules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Utilities.Driver;

public class ToDosListPage extends Driver{

	String task = "";
	String ToDoEditBox = "//input[@class='new-todo']";
	String ToDoList = "//*[contains(label,'"+task+"')]";

	// *****************************************************************************************
	// * Name : AddTasks
	// * Description : This function adds tasks in to do list box
	// * Author : Tarun Bansal
	// * Input Params : task to be added
	// * Return Values: Null
	// * Date : 01/04/2022
	// * Modify Date :
	// *****************************************************************************************

	public void AddTasks(String task) {

		driver.findElement(By.xpath(ToDoEditBox)).sendKeys(task);
		driver.findElement(By.xpath(ToDoEditBox)).sendKeys(Keys.ENTER);

	}

	// *****************************************************************************************
	// * Name : ValidateTasks
	// * Description : This function validate tasks added in the list
	// * Author : Tarun Bansal
	// * Input Params : task to be validated
	// * Return Values: Null
	// * Date : 01/04/2022
	// * Modify Date :
	// *****************************************************************************************

	public void ValidateTasks(String task) {

		if (driver.findElement(By.xpath(ToDoList)).isDisplayed()){
			ExtentCucumberAdapter.addTestStepLog("Task "+ task + " is added successfuly.");
		}
		else {
			ExtentCucumberAdapter.addTestStepLog("Task "+ task + " is not added successfuly.");
			Assert.assertTrue(false);
		}
	}



}
