package InformationAboutWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class isenable {
    WebDriver driver;

    By emailInput = By.name("email_input");

    @Test
    public void testCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://www.selenium.dev/selenium/web/inputs.html");
        boolean isEmailEnabled = findElement(emailInput).isEnabled();
        System.out.println(isEmailEnabled);
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
