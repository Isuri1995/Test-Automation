package com.xinfinit.automation.pages;

import com.xinfinit.automation.browserFactory.DriverSetup;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SignUp extends DriverSetup {

    @FindBy(xpath="//a[text()='Login / Sign up']")
    WebElement signUpBtn;

    public SignUp(){
        PageFactory.initElements(driver,this);
    }

    public void clickUp() throws IOException {
        try {signUpBtn.click();
            System.out.println("SignIn: Pass");
            //return new Login();
        }catch (NoSuchElementException e){e.printStackTrace();throw new RuntimeException("SignIn: Fail");}

    }

}
