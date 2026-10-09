package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keydown {
    WebDriver driver;

    By input = By.id("target");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();   // opens a new Microsoft Edge browser window
        maximize();
        navigateTo("https://the-internet.herokuapp.com/key_presses");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).perform();
    }

    @Test
    public void TestCaseTwo() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/key_presses");
        driver.findElement(input).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys("m").perform();
    }

    @Test
    public void TestCaseThree() {
        driver = new EdgeDriver();   // opens a new Microsoft Edge browser window
        maximize();
        navigateTo("https://the-internet.herokuapp.com/key_presses");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(driver.findElement(input), "mohammed").perform();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

}
