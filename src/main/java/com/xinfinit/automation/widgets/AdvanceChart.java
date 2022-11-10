package com.xinfinit.automation.widgets;

import com.xinfinit.automation.browserFactory.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class AdvanceChart extends DriverSetup {

    public void widgetAdd(String widgetName) throws AWTException, IOException {
        //isWidgetNameNullOrEmpty(widgetName);
        try{driver.findElement(By.xpath( "//*[@rel='widget-library-dropdown-menu']//*[@rel='"+widgetName+"']")).isDisplayed();
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath( "//*[@class='c-dropdown open']//*[@rel='"+widgetName+"']")))
                    .click()
                    .pause(2000)
                    .clickAndHold()
                    .moveByOffset(-700,50)
                    .pause(2000)
                    .release().build().perform();
            if(driver.findElement(By.xpath( "//*[@widget-type='"+widgetName+"']")).isDisplayed()){
                System.out.println("Drag & drop"+" "+widgetName+" "+"widget: Pass");
            }else {throw new NoSuchElementException("Drag & drop"+" "+widgetName+" "+"widget: Fail");}
        }catch (NoSuchElementException e){e.printStackTrace(); throw new RuntimeException(widgetName+" "+"widget is not available in the widget library!");}
    }

    public AdvanceChart(){
        PageFactory.initElements(driver,this);
    }
}
