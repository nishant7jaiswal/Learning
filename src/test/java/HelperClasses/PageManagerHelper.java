package HelperClasses;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageManagerHelper {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public PageManagerHelper(WebDriver driver) {
        this.driver =driver;
    }

    public LoginPage getLoginPage() {
        if(loginPage == null)
        {
            loginPage =new LoginPage(driver);
        }
        return loginPage;
    }

    public HomePage getHomePage() {
        if(homePage == null)
        {
            homePage =new HomePage(driver);
        }
        return homePage;
    }






}
