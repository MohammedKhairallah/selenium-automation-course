package FindingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ShadowDOM {
    WebDriver driver;

    By shadowHost = By.tagName("custom-checkbox-element");
    By checkboxInput = By.cssSelector("[type=\"checkbox\"]");

    @Test
    public void testCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://www.selenium.dev/selenium/web/shadowRootPage.html");
        driver.findElement(shadowHost).getShadowRoot().findElement(checkboxInput).click();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }
}
