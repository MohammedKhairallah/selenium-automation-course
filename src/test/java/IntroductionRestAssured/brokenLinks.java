package IntroductionRestAssured;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class brokenLinks {
    WebDriver driver;
    By link = By.id("redirect");


    @Test
    public void TestCaseOne() {
        driver = new EdgeDriver();
        maximize();
        navigateTo("https://the-internet.herokuapp.com/redirector");
        String href = driver.findElement(link).getDomProperty("href");

        try {
            URL url = new URI(href).toURL();
            Response response = io.restassured.RestAssured.given().get(url);
            System.out.println(response.getStatusLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
}
