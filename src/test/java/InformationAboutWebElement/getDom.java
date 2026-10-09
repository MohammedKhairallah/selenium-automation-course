package InformationAboutWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class getDom {
    WebDriver driver;

    By emailInput = By.name("email_input");

    @Test
    public void testCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://www.selenium.dev/selenium/web/inputs.html");
        type(emailInput, "mohammed@gmail.com");
        String text = findElement(emailInput).getDomAttribute("value");
        System.out.println(text);
        text = findElement(emailInput).getDomProperty("value");
        System.out.println(text);
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

    public void type(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
}
