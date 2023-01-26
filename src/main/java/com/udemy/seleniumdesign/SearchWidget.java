package com.udemy.seleniumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchWidget extends AbstractComponents {

    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        super(driver);
    }

    public void enter(String keyword){
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        return wait.until((d) -> this.searchBox.isDisplayed());
    }
}
