package com.xinfinit.automation.pageTests;

import com.xinfinit.automation.browserFactory.DriverSetup;
import com.xinfinit.automation.pages.Home;
import com.xinfinit.automation.pages.Login;
import com.xinfinit.automation.pages.SignUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeTest extends DriverSetup {

    //SignUp signup;
    //Login login;
    Home home;

    public HomeTest(){
        super();
    }


    @BeforeMethod
    public void setup() throws Exception{
        //signup = new SignUp();
        //login = signup.clickUp();
        //home = login.loginTest(prop.getProperty("username"),prop.getProperty("password"));
        home = new Home();
    }

    //@AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "verifycustomerworkspacemenunavigation", priority = 1)
    public void verifycustomerworkspacemenunavigation() throws InterruptedException, IOException {
        home.clickUpCustomWorkspaceMenu();
    }

    //@Test(description = "verifyideasmenunavigation", priority = 2)
    public void verifyideasmenunavigation() throws InterruptedException, IOException {
        home.clickUpIdeasMenu();
    }

    //@Test(description = "verifysetnickname", priority = 3)
    public void verifysetnickname() throws InterruptedException, IOException {
        home.setNickName("isurikuruwita");
    }

    //@Test(description = "verifysetprofilepicture", priority = 4)
    public void verifysetprofilepicture() throws InterruptedException, IOException {
        home.setProfilePicture();
    }

}
