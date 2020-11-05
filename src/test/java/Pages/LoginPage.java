package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    WebDriver driver;


    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;


    @FindBy(id ="log-in")
    WebElement loginButton;

    public LoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        username.sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

        password.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

        loginButton.click();

    }


    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();

    }



}
