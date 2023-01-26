package com.udemy.seleniumdesign.common;

import com.udemy.seleniumdesign.common.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
        return this.wait.until((d) -> this.allSuggestions.size() > 5);
    }
}
