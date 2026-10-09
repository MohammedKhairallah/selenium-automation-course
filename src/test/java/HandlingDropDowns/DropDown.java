package HandlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
    WebDriver driver;

    By dropdown = By.id("dropdown");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/dropdown");

        new Select(driver.findElement(dropdown)).selectByValue("1");
    }

    @Test
    public void TestCaseTwo() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/dropdown");

        new Select(driver.findElement(dropdown)).selectByValue("2");
    }

    @Test
    public void TestCaseThree() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/dropdown");

        clicking(dropdown); // opening dropdown
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
