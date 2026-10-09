package WheelActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolltoelement {
    WebDriver driver;

    By iframe = By.tagName("iframe");

    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(iframe)).perform();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
}
