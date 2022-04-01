package stepDefinitions;

import java.io.IOException;

import ApplicationModules.LoginPage;
import io.cucumber.java.en.Given;


public class LoginPageSteps {
	LoginPage login = new LoginPage();
	@Given("MVC user should be able to login to the application {}")
	 public void loginToVUEApplication(String propFileName) throws IOException, InterruptedException  {
		login.LoginVUE(propFileName);
	 }

}
