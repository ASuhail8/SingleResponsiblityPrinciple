package com.udemy.seleniumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractComponents {

    protected WebDriverWait wait;


    public AbstractComponents(final WebDriver driver){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    public abstract boolean isDisplayed();
}
