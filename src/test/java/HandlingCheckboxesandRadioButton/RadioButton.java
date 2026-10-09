package HandlingCheckboxesandRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButton {
    WebDriver driver;
    By radioInput = By.cssSelector("input[value='radio2']");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://www.selenium.dev/selenium/web/inputs.html");
        System.out.println(driver.findElement(radioInput).isSelected());
        clicking(radioInput);
        System.out.println(driver.findElement(radioInput).isSelected());
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
