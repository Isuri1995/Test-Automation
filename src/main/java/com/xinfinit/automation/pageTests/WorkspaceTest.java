package com.xinfinit.automation.pageTests;

import com.xinfinit.automation.browserFactory.AppConfiguraion;
import com.xinfinit.automation.browserFactory.DriverSetup;
import com.xinfinit.automation.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static com.xinfinit.automation.browserFactory.DriverSetup.driver;

public class WorkspaceTest extends DriverSetup {

    //SignUp signup;
    //Login login;
    //Home home;
    Workspaces workspaces;

    public WorkspaceTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws Exception{
        //initializeDriver();
        //signup = new SignUp();
        //login = signup.clickUp();
        //home = login.loginTest(prop.getProperty("username"),prop.getProperty("password"));
        //workspaces = workspaces.verifyAddNewWorkspace();
        workspaces = new Workspaces();
    }

    //@AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "verifyAddNewWorkspace",priority = 1)
    public void verifyAddNewWorkspace() throws InterruptedException,IOException{
        workspaces.AddWorkspaceBtn();
    }

    @Test(description = "verifyToCreateGridWorkspace",priority = 2)
    public void verifyToCreateGridWorkspace() throws InterruptedException,IOException{
        workspaces.createGridWorkspace();
        //drag & drop widget to the grid layout
        //workspaces.widgetAdd();
    }

    @Test(description = "verifyToEditWorkspace",priority = 2)
    public void verifyToEditWorkspace() throws InterruptedException, IOException, AWTException {
        workspaces.editWorkspace("hello");
    }

    //@Test(description = "verifyToWidgetAdd",priority = 4)
    public void verifyToWidgetAdd() throws InterruptedException, IOException, AWTException {
        //workspaces.widgetAdds();
    }


    //@Test(description = "verifyToDeleteGridWorkspace",priority = 5)
    public void verifyToDeleteGridWorkspace() throws InterruptedException,IOException {
        workspaces.deleteWorkspace();
    }

    //@Test(description = "verifyToDeleteConfirmBtn",priority = 6)
    public void verifyToDeleteConfirmBtn() throws InterruptedException,IOException {
        workspaces.deleteMenuItemDeleteBtn();

    }

}
