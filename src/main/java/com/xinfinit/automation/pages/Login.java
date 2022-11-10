package com.xinfinit.automation.pages;

import com.xinfinit.automation.browserFactory.DriverSetup;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login extends DriverSetup {

    @FindBy(id = "username")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(id = "kc-login")
    WebElement loginBtn;

    public Login(){
        PageFactory.initElements(driver,this);
    }

    public void loginTest(String un, String pwd) throws IOException {
        try {   username.sendKeys(un);
                password.sendKeys(pwd);
                loginBtn.click();
            System.out.println("Login: Pass");
            //return new Home();
        }catch (NoSuchElementException e){e.printStackTrace();throw new RuntimeException("Login: Fail");}

    }


}
