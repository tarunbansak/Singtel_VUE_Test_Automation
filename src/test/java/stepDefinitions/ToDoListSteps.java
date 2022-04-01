package stepDefinitions;

import java.io.IOException;

import ApplicationModules.ToDosListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToDoListSteps {
	ToDosListPage toDoList = new ToDosListPage();
		
	@When("User adds task {} in the to do box")
	 public void addTasks(String task) throws IOException, InterruptedException  {
		toDoList.AddTasks(task);
	 }
	
	@Then("Task {} should get added in the list")
	 public void taskValidation(String task) throws IOException, InterruptedException  {
		toDoList.ValidateTasks(task);
	 }
}
