package HandlingCheckboxesandRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes {
    WebDriver driver;
    By checkbox = By.cssSelector("#checkboxes input[type='checkbox']");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(checkbox);
        System.out.println(checkboxes.get(0).isSelected());
        System.out.println(checkboxes.get(1).isSelected());
        checkboxes.get(0).click();
        System.out.println(checkboxes.get(0).isSelected());

    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
}
