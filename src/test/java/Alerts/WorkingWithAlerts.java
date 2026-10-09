package Alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WorkingWithAlerts {
    WebDriver driver;

    By jsAlert = By.cssSelector("[onclick=\"jsAlert()\"]");
    By jsConfirm = By.cssSelector("[onclick=\"jsConfirm()\"]");
    By jsPrompt = By.cssSelector("[onclick=\"jsPrompt()\"]");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsAlert).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public void TestCaseTwo() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsConfirm).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public void TestCaseThree() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsConfirm).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }

    @Test
    public void TestCaseFour() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsPrompt).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Moahmmed");
        alert.dismiss();
    }

    @Test
    public void TestCaseFive() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsPrompt).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Moahmmed");
        alert.accept();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
}
