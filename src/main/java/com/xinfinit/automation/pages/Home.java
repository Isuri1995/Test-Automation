package com.xinfinit.automation.pages;

import com.xinfinit.automation.browserFactory.DriverSetup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class Home extends DriverSetup {

    @FindBy(xpath = "//div[@class='c-side-panel h-100']")
    WebElement expandhamburgermenu;

    @FindBy(xpath = "//*[@class='c-side-panel__item c-side-panel__menu']//li[5]/div[@class='c-side-panel__menu-icon']")
    WebElement customerworkspace;

    @FindBy(xpath = "//*[@class='c-side-panel__item c-side-panel__menu']//li[2]/div[@class='c-side-panel__menu-icon']")
    WebElement ideas;

    @FindBy(xpath = "//button[@class='c-btn c-btn--transparent c-dropdown__toggle']")
    WebElement profilesettingsdropdown;

    @FindBy(xpath = "//span[@class='c-profile-settings__nickname']")
    WebElement profileSettingsNickName;

    @FindBy(xpath = "//input[@placeholder='Type your nickname here']")
    WebElement clearAndAddNickName;

    @FindBy(xpath = "//button[text()=\"Submit\"]")
    WebElement setNicknameSubmitBtn;

    @FindBy(xpath = "//div[@class='modal-footer']//button[@ng-click='$ctrl.onClose()']")
    WebElement setNicknameCancelBtn;

    @FindBy(xpath = "//div[@class='m-app-settings__img']//label[@class='c-btn c-btn--default']")
    WebElement setProfilePicture;


    public Home() {
        PageFactory.initElements(driver, this);
    }


    public void clickUpCustomWorkspaceMenu() throws IOException {
        try {
            customerworkspace.click();
            System.out.println("Customworkspace menu navigation: Pass");
            //return new CustomWorkspace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new RuntimeException("Customworkspace menu navigation: Fail");
        }
    }

    public void clickUpIdeasMenu() throws IOException {
        try {
            ideas.click();
            System.out.println("Ideas menu navigation: Pass");
            //return new CustomWorkspace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new RuntimeException("Ideas menu navigation: Fail");
        }
    }

    public void setNickName(String nickName) throws IOException {
        try {
            waitForLowTime();
            profilesettingsdropdown.click();
            profileSettingsNickName.click();
            waitForLowTime();
            clearAndAddNickName.clear();
            clearAndAddNickName.sendKeys(nickName);
            waitForLowTime();
            setNicknameSubmitBtn.click();
            System.out.println("Profile Nickname Update: Pass");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new RuntimeException("Profile Nickname Update: Fail");
        }
    }

    public void setProfilePicture() throws IOException {
        try {
            waitForLowTime();
            profilesettingsdropdown.click();
            profileSettingsNickName.click();
            setProfilePicture.click();
            System.out.println("Profile Picture Update: Pass");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new RuntimeException("Profile Picture Update: Fail");
        }
    }

/*
    public void clickUpnewCustomWorkspace() throws IOException {
        try {Actions actions = new Actions(driver);
            actions.moveToElement(expandhamburgermenu).perform();
            waitForLowTime();
            customerworkspace.click();
            System.out.println("Ideas menu navigation: Pass");
            //return new CustomWorkspace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new RuntimeException("Ideas menu navigation: Fail");
        }
    }

 */
    
}


