package com.udemy.seleniumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

}
