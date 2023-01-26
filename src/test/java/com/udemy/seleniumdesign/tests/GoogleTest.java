package com.udemy.seleniumdesign.tests;

import com.udemy.seleniumdesign.main.GoogleMainPage;
import com.udemy.seleniumdesign.result.GoogleResultPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;

    @BeforeTest
    public void setUpPages() {
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleWorkflowTest(String keyword, int index){
        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());

        googleMainPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());

        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(index);
        Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());

        googleResultPage.getNavigationBar().goToNews();

        System.out.println(googleResultPage.getResultStat().getStats());

    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][] {
                {"Selenium WebDriver",3},
                {"docker",2}
        };
    }
}
