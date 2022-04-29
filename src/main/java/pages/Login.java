package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base{
    public Login(WebDriver driver) {
        super(driver);
    }

    private By email= By.id("Email");
    private By password=By.id("Password");
    private By btnlogin=By.xpath("//button[text()='Log in']");
    private By message=By.xpath("//div[@class='content-header']/child::h1");
    ///////////////////////////////////////
    public void setemail(String theemail)
    {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(theemail);
    }
    //////////////////////////////////
    public void setpassword(String thepassword)
    {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(thepassword);
    }
    ////////////////////////////////////////////////
    public void click()
    {
        driver.findElement(btnlogin).click();
    }
    public String theresult()
    {
       String txt=driver.findElement(message).getText();
       return txt;
    }
}
