package WaitingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaits {
    WebDriver driver;

    By startButton = By.tagName("button");
    By msg = By.cssSelector("#finish > h4");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
        navigateTo("https://the-internet.herokuapp.com/dynamic_loading/1");
        clicking(startButton);

        String massage = driver.findElement(msg).getText();
        System.out.println(massage);

    }

    @Test
    public void TestCaseTwo() {
        driver = new EdgeDriver();
        maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
        navigateTo("https://the-internet.herokuapp.com/dynamic_loading/2");
        clicking(startButton);

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
