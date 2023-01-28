package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleEnglish extends GooglePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(name="q")
    private WebElement searchbox;

    @FindBy(name="btnK")
    private WebElement searchBtn;

    @FindBy(id="result-stats")
    private WebElement resultstat;

    public GoogleEnglish(final WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.com");
    }

    @Override
    public void search(String keyword) {
        searchbox.sendKeys(keyword);
        this.wait.until((d) -> this.searchBtn.isDisplayed());
        this.searchBtn.click();
    }

    @Override
    public int getResultsCount() {
        this.wait.until((d)-> resultstat.isDisplayed());
        return Integer.parseInt(resultstat.getText());
    }
}
