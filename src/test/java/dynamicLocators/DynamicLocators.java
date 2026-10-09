package dynamicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class DynamicLocators {
    WebDriver driver;

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://jqueryui.com/");
        chooseCategory("OpenJS Foundation");
        chooseSubCategory("Members");
        driver.navigate().back();
        chooseCategory("Contribute");
        chooseSubCategory("Documentation");
        driver.navigate().back();
    }

    public void chooseCategory(String option) {
        new Actions(driver)
                .moveToElement(driver
                        .findElement(By.xpath("//li[@class='dropdown']//a[.='" + option + "']")))
                .perform();
    }

    public void chooseSubCategory(String option) {
        driver.findElement(By.xpath("//a[.='" + option + "']")).click();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
}
