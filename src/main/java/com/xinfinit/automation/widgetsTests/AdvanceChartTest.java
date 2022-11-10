package com.xinfinit.automation.widgetsTests;

import com.xinfinit.automation.browserFactory.DriverSetup;
import com.xinfinit.automation.pages.Workspaces;
import com.xinfinit.automation.widgets.AdvanceChart;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class AdvanceChartTest extends DriverSetup{

    AdvanceChart advancechart;

    public AdvanceChartTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws Exception{
        advancechart = new AdvanceChart();
    }

    /*
    private void isWidgetNameNullOrEmpty(String widgetName){
        boolean result;
        result = (widgetName == null || widgetName.length() == 0);
        if (result){
            throw new NullPointerException("Widget name is null or empty!");
        }else{System.out.println("Is widget name null or empty?"+" "+ false +".");}
    }

     */


    @Test(description = "verifyToAddAdvancedChartWidgetToGridLayout",priority = 1)
    public void verifyToAddAdvancedChartWidget() throws AWTException, IOException {
        advancechart.widgetAdd(prop.getProperty("advanceChart"));
        //objWorkspaces.selectMainWorkspace("Grid");
        //objWidgetLibrary.enableWidgetLibrary();
        //widgetAdd(widgets.getProperty("advancedChart"));
        //objWidgetLibrary.disableWidgetLibrary();
    }

}
