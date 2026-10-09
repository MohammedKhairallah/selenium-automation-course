package WaitingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaits {
    WebDriver driver;

    By startButton = By.tagName("button");
    By msg = By.cssSelector("#finish > h4");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/dynamic_loading/1");

        clicking(startButton);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(msg));
        String massage = driver.findElement(msg).getText();
        System.out.println(massage);
    }

    @Test
    public void TestCaseTwo() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/dynamic_loading/1");

        clicking(startButton);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(msg).isDisplayed());
        String massage = driver.findElement(msg).getText();
        System.out.println(massage);
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void clicking(By by) {
        driver.findElement(by).click();
    }
}
