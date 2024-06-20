package stepdefination;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before("@addClient")
    public void beforeScenario() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        driver.findElement(By.id("login-username")).sendKeys("Admin");
        driver.findElement(By.id("login-password")).sendKeys("Admin");
        driver.findElement(By.name("submit")).click();
    }

    @After("@addClient")
    public void afterScenario(){
        driver.close();
    }
    public static WebDriver getDriver(){
        return driver;
    }


}
