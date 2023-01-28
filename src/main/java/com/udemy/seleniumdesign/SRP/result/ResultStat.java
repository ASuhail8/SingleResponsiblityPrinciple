package com.udemy.seleniumdesign.SRP.result;

import com.udemy.seleniumdesign.SRP.common.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStat extends AbstractComponents {

    @FindBy(id="result-stats")
    private WebElement stats;


    public String getStats() {
        return this.stats.getText();
    }

    public ResultStat(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.stats.isDisplayed());
    }
}
