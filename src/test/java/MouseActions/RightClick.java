package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class RightClick {
    WebDriver driver;

    By clickable = By.id("clickable");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(clickable)).perform();
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
