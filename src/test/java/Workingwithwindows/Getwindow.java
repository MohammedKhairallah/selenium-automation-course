package Workingwithwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Getwindow {
    WebDriver driver;

    By clickHere = By.cssSelector(".example > a");
    By newTab = By.cssSelector("body > .example > h3");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/windows");
        String parent = driver.getWindowHandle();
        driver.findElement(clickHere).click();
        String child = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(newTab).getText());
        driver.switchTo().window(parent);
    }

    @Test
    public void TestCaseTwo() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/windows");
        driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.nezamacademy.com");
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
}
