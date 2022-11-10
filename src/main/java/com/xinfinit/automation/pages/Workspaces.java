package com.xinfinit.automation.pages;

import com.xinfinit.automation.browserFactory.DriverSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Workspaces extends DriverSetup {

    @FindBy(xpath = "//*[@rel='topHrMenu']//div[3][@class='w-main-navigation__item w-main-navigation__item-create']")
    WebElement verifyAddNewWorkspace;

    @FindBy(xpath = "//*[@class='layout-list']//li[1]/a[@class='layout-img-title btn btn-default']")
    WebElement verifyCreatetGridWorkspace;

    @FindBy(xpath = "//*[@class='layout-list']//li[2]/a[@class='layout-img-title btn btn-default']")
    WebElement verifyCreatetFlexWorkspace;

    @FindBy(xpath = "//*[@class='layout-list']//li[3]/a[@class='layout-img-title btn btn-default']")
    WebElement verifyCreatetWindowsWorkspace;

    @FindBy(xpath = "//*[@class='layout-list']//li[4]/a[@class='layout-img-title btn btn-default']")
    WebElement verifySelectImportWorkspace;

    @FindBy(xpath = "//div[@class='w-main-navigation__workspace-holder']//span[2][contains(text(),'Workspace')]")
    WebElement verifyEditWorkspace;
    //div[@class='w-main-navigation__workspace-holder']//span[2][contains(text(),'Workspace 1')]
    //*[@class='w-main-navigation__instructor-item']//span[@class='tab-title']
    //div[@class='w-main-navigation__workspace-holder']//span[2][contains(text(),'Workspace')]
    @FindBy(xpath = "//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='rename-menu']")
    WebElement verifyClearAndAddHeaderName;

    @FindBy(xpath = "//*[@class='w-main-navigation__instructor-item']//span[@class='tab-title']")
    WebElement verifyDoubleClickWorkspace;
    @FindBy(xpath = "//*[@class='w-main-navigation__instructor-item']//span[@class='delete-menu']")
    WebElement verifyDeleteWorkspace;

    @FindBy(xpath = "//*[@class='btn btn-info']")
    WebElement verifyDeleteMenuItemPopupDleteBtn;

    @FindBy(xpath = "//li[1][@class='ui-draggable ui-draggable-handle']")
    WebElement drag;

    @FindBy(xpath = "//div[@class='position--relative']")
    WebElement drop;

    public Workspaces(){
        PageFactory.initElements(driver,this);
    }

    public void AddWorkspaceBtn() throws IOException {
        try {verifyAddNewWorkspace.click();
            waitForLowTime();
            System.out.println("Add new workspace: Pass");
            //return new Workspaces();
        }catch (NoSuchElementException e){e.printStackTrace();throw new RuntimeException("Add new workspace: Fail");}
    }

    public void createGridWorkspace() throws IOException {
        try {waitForLowTime();
            verifyCreatetGridWorkspace.click();
            waitForLowTime();
            System.out.println("Create grid workspace: Pass");
            //return new Workspaces();
        }catch (NoSuchElementException e){e.printStackTrace();throw new RuntimeException("Create grid workspace: Fail");}
    }


/*
    public void editWorkspace(String widgetName) throws InterruptedException {
        try {verifyEditWorkspace.isDisplayed();
            String headerName = verifyEditWorkspace.getText();
            Actions actions = new Actions(driver);
            actions.doubleClick(verifyEditWorkspace).build().perform();
            waitForLowTime();
            verifyClearAndAddHeaderName.clear();
            verifyClearAndAddHeaderName.sendKeys(widgetName);
            verifyClearAndAddHeaderName.sendKeys(Keys.ENTER);
            if(!verifyClearAndAddHeaderName.getText().equals(headerName)){
                    System.out.println("widget header renamed:Pass");
            }else {throw new InvalidArgumentException("header name not renamed");}
        }catch (InvalidArgumentException e) {e.printStackTrace(); throw new RuntimeException("widget header name is not available");}
    }

 */
/*
    public void editWorkspace(String widgetName) throws InterruptedException {
        try {driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='"+widgetName+"']")).isDisplayed();
            String headerName = driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='"+widgetName+"']")).getText();
            Actions actions = new Actions(driver);
            actions.doubleClick(driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='"+widgetName+"']"))).build().perform();
            waitForLowTime();
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetName+"']")).clear();
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetName+"']")).sendKeys(widgetName);
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetName+"']")).sendKeys(Keys.ENTER);
            if(!driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetName+"']")).getText().equals(widgetName)){
                System.out.println("widget header renamed:Pass");
            }else {throw new InvalidArgumentException("header name not renamed");}
        }catch (InvalidArgumentException e) {e.printStackTrace(); throw new RuntimeException("widget header name is not available");}
    }

 */

    public void editWorkspace(String widgetName) throws InterruptedException {
        try {driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='tab-title']")).isDisplayed();
            String headerName = driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='tab-title']")).getText();
            Actions actions = new Actions(driver);
            actions.doubleClick(driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='tab-title']"))).build().perform();
            waitForLowTime();
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='rename-menu']")).clear();
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='rename-menu']")).sendKeys(widgetName);
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='rename-menu']")).sendKeys(Keys.ENTER);
            if(!driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='rename-menu']")).getText().equals(widgetName)){
                System.out.println("widget header renamed:Pass");
            }else {throw new InvalidArgumentException("header name not renamed");}
        }catch (InvalidArgumentException e) {e.printStackTrace(); throw new RuntimeException("widget header name is not available");}
    }


/*
    public void widgetHeaderRaname(String widgetname) throws AWTException, IOException{
        try {driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='"+widgetname+"']")).isDisplayed();
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(By.xpath("//div[@class='w-main-navigation__workspace-holder']//span[2][@class='"+widgetname+"']"))).build().perform();
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetname+"']")).clear();
            driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetname+"']")).sendKeys(widgetname+"Renaming");
            action.sendKeys(Keys.ENTER).build().perform();
                //if (!driver.findElement(By.xpath("//div[@ng-repeat='customMenuItem in menuCtrl.selectedMainPage.customItems track by $index']//div[@class='c-nav-btn created-menu']//input[@rel='"+widgetname+"']")).getText().equals()
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

 */



    public void deleteWorkspace() throws IOException {
        try {Actions actions = new Actions(driver);
            actions.doubleClick(verifyDoubleClickWorkspace).perform();
            waitForLowTime();
            verifyDeleteWorkspace.click();
            System.out.println("Delete Grid workspace: Pass");
            //return new Workspaces();
        }catch (NoSuchElementException e){e.printStackTrace();throw new RuntimeException("Delete Grid workspace: Fail");}
    }

    public void deleteMenuItemDeleteBtn() throws IOException {
        try {verifyDeleteMenuItemPopupDleteBtn.click();
            System.out.println("Delete Grid workspace: Pass");
            //return new Workspaces();
        }catch (NoSuchElementException e){e.printStackTrace();throw new RuntimeException("Delete Grid workspace: Fail");}
    }
}



