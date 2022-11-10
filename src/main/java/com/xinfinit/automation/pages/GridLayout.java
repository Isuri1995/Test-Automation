package com.xinfinit.automation.pages;

import com.xinfinit.automation.browserFactory.DriverSetup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class GridLayout extends DriverSetup {

    @FindBy(xpath = "//*[@class='w-main-navigation__instructor-item']//span[@class='item edit-menu']")
    WebElement editmenu;
    //div[@class='w-main-navigation__workspace-holder']//span[2][@class='tab-title']
    @FindBy(xpath = "//input[@ng-click='$event.stopPropagation();']")
    //@FindBy(xpath = "//*[@class='c-form-control c-form-control--bottom-line ng-pristine ng-valid ng-valid-maxlength ng-not-empty ng-touched']")
    //@FindBy(xpath = "//div[1][@class='c-nav-btn created-menu']//span[2][@class='tab-title']")
    WebElement add_text;

    @FindBy(xpath = "//input[@ng-click='$event.stopPropagation();']")
    WebElement clickheader;

    @FindBy(xpath = "//*[@class='w-main-navigation__instructor-item']//span[@class='delete-menu']")
    WebElement deletemenuicon;

    @FindBy(xpath = "//*[@class='btn btn-info']")
    WebElement deleteBtn;

    public GridLayout() {
        PageFactory.initElements(driver, this);
    }

    public void Clickeditbtn() {
        editmenu.click();
    }

    public void clearAddText(String newText) {
        add_text.clear();
        add_text.sendKeys(newText);
    }

    public void clickEnter(){
        clickheader.sendKeys(Keys.ENTER);
    }

    public void clickDeleteMenu(){
        deletemenuicon.click();
    }

    public void clickDeleteBtn(){
        deleteBtn.click();
    }

}



