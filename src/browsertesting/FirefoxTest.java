package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("xyz123@");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("mno890=");

        driver.close();
    }
}
