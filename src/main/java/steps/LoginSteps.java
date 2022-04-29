package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class LoginSteps {
    WebDriver driver;
    Login log;
    @Given("the user launch the browser")
    public void the_user_launch_the_browser() {
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
    }
    @When("the user open the page of the admin as {string}")
    public void the_user_open_the_page_of_the_admin_as(String url) {
       driver.get(url);
    }
    @When("the user enter the valid email as {string} and valid password as {string}")
    public void the_user_enter_the_valid_email_as_and_valid_password_as(String email, String password) {
        log=new Login(driver);
        log.setemail(email);
        log.setpassword(password);
    }
    @When("the user click to login button")
    public void the_user_click_to_login_button() {
       log=new Login(driver);
       log.click();
    }
    @Then("verify that the user login successfully")
    public void verify_that_the_user_login_successfully() {
        log=new Login(driver);
        Assert.assertEquals(log.theresult(),"Dashboard");
    }
    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}
