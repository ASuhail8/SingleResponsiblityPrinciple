package com.udemy.seleniumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchSuggestion extends AbstractComponents {

    @FindBy(css = "li.sbct")
    private List<WebElement> allSuggestions;

    public SearchSuggestion(final WebDriver driver){
        super(driver);
    }

    public void clickSuggestionByIndex(int index){
        this.allSuggestions.get(index-1).click();
    }

    @Override
    public boolean isDisplayed() {
        return wait.until((d) -> this.allSuggestions.size() > 5);
    }
}
