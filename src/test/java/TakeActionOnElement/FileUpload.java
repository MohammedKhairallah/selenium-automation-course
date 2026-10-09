package TakeActionOnElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class FileUpload {
    WebDriver driver;

    By fileUpload = By.id("file-upload");
    By button = By.id("file-submit");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/upload");
        uploadFile(fileUpload, "src/main/resources/file.text");
        clicking(button);
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

    public void uploadFile(By by, String filePath) {
        driver.findElement(by).clear();
        String userHome = System.getProperty("user.dir");
        driver.findElement(by).sendKeys(userHome + File.separator + filePath);
    }

    public void clicking(By by) {
        driver.findElement(by).click();
    }
}
