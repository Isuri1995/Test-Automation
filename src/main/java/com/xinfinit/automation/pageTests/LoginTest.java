package com.xinfinit.automation.pageTests;

import com.xinfinit.automation.browserFactory.DriverSetup;
import com.xinfinit.automation.pages.Home;
import com.xinfinit.automation.pages.Login;
import com.xinfinit.automation.pages.SignUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends DriverSetup {

    Login login;
    //SignUp signup;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws Exception {
        //signup = new SignUp();
        //login = signup.clickUp();
        login = new Login();
    }

    //@AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "verifyLogin")
    public void verifyLogin() throws InterruptedException, IOException {
          login.loginTest(prop.getProperty("username"),prop.getProperty("password"));
    }
}
