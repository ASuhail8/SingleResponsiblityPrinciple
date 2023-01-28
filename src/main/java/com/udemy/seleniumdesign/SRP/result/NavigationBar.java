package com.udemy.seleniumdesign.SRP.result;

import com.udemy.seleniumdesign.SRP.common.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponents {

    @FindBy(id = "hdtb-msb")
    private WebElement bar;

    @FindBy(xpath = "//a[text()='Images']")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToNews(){
        this.news.click();
    }

    public void goToImages(){
        this.images.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.bar.isDisplayed());
    }
}
