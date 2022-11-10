package com.xinfinit.automation.pageTests;

import com.xinfinit.automation.browserFactory.DriverSetup;
import com.xinfinit.automation.pages.Login;
import com.xinfinit.automation.pages.SignUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTest extends DriverSetup {
    SignUp signup;

    public SignUpTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws Exception{
        signup = new SignUp();
    }

   //@AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "verifySignIn")
    public void verifySignIn() throws InterruptedException, IOException {
        signup.clickUp();
    }








}
