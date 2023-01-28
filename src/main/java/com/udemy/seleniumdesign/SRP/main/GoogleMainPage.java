package com.udemy.seleniumdesign.SRP.main;

import com.udemy.seleniumdesign.SRP.common.SearchSuggestion;
import com.udemy.seleniumdesign.SRP.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        this.searchWidget = PageFactory.initElements(driver,SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public void goTo(){
        this.driver.get("https://www.google.com");
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

}
