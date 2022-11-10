package com.xinfinit.automation.pageTests;

import com.xinfinit.automation.browserFactory.DriverSetup;
import com.xinfinit.automation.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridLayoutTest extends DriverSetup {

    SignUp signup;
    Login login;
    Home home;
    //CustomWorkspace customworkspace;
    Workspaces workspaces;
    GridLayout gridLayout;

    @BeforeMethod
    public void setup() {
        //initializeDriver();
        //signup = new SignUp();
        //login = signup.clickUp();
        //home = login.loginTest(prop.getProperty("username"), prop.getProperty("password"));
        //customworkspace = home.clickUpCustomWorkspace();
        //workspaces = customworkspace.ClickAddworkspacebtn();
        //gridLayout = workspaces.ClickGridbtn();
        //gridLayout = new GridLayout();
    }

    //@AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addNewWorkspace(){
        gridLayout.Clickeditbtn();
        gridLayout.clearAddText("hi");
        gridLayout.clickEnter();
        gridLayout.Clickeditbtn();
        gridLayout.clickDeleteMenu();
        gridLayout.clickDeleteBtn();
    }

}
