package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class LoginSD {
    WebDriver driver;
    @Given("User on the Login page")
    public void user_on_the_login_page() {
        System.out.println("Login Page");
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://stock.scriptinglogic.in/");

    }

    @When("User enter correct username and password")
    public void user_enter_correct_username_and_password() {
        System.out.println("username  and Password");
        driver.findElement(By.id("login-username")).sendKeys("Admin");
        driver.findElement(By.id("login-password")).sendKeys("Admin");
    }

    @And("Click on Login button")
    public void click_on_login_button() {
        System.out.println("Click on Login");
        driver.findElement(By.name("submit")).click();
    }
    @Then("User should be land on Dashboard")
    public void user_should_be_land_on_dashboard() {
        System.out.println("on Dashboard");
        String expected ="https://stock.scriptinglogic.in/dashboard.php";
        String Actual=driver.getCurrentUrl();
        Assert.assertEquals("This is incorrect path",expected,Actual);
    }

    @When("User enter incorrect username and password")
    public void userEnterIncorrectUsernameAndPassword() {
        System.out.println("Incorrect username an password" );
        driver.findElement(By.id("login-username")).sendKeys("Admin12345");
        driver.findElement(By.id("login-password")).sendKeys("Admin12345");

    }

    @Then("User should get an error")
    public void userShouldGetAnError() {
        System.out.println("error display");
        String expected ="Wrong Username or Password";
     //   WebElement tc = driver.findElement(By.xpath("//*[contains(@class, 'error-box')]"));
        String Actual = driver.findElement(By.xpath("//*[contains(@class, 'error-box')]")).getText();
        System.out.println("Expected"+expected);
        System.out.println("Actual"+Actual);
        Assert.assertEquals("This is incorrect no error message",expected,Actual);
    }

    @When("User enter Bank username and password")
    public void userEnterBankUsernameAndPassword() {
        System.out.println("Blank username an password" );
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");

    }

    @Then("User should get an error messeage for both username and password")
    public void userShouldGetAnErrorMesseageForBothUsernameAndPassword() {
        System.out.println("error display for both field");
        String expected1 = "PLEASE ENTER A USERNAME";
        String expected2 = "PLEASE PROVIDE A PASSWORD";
        String[] expected = new String[2];
        expected[0]=expected1;
        expected[1]=expected2;

        String[] actual = new String[2];
        List<WebElement> wbList = driver.findElements(By.xpath("//label[@class='error']"));
        actual[0]=wbList.get(0).getText();
        actual[1]=wbList.get(1).getText();


        System.out.println("Expected elements:");
        for (String element : expected) {
            System.out.println("Element text: " + element);
        }

        System.out.println("Actual elements:");
        for (String element : actual) {
            System.out.println("Element text: " + element);
        }
        Assert.assertEquals("This is incorrect no error message",expected,actual);
    }

    @When("User enter {string} and {string}")
    public void userEnterAnd(String Username, String Password) {
        driver.findElement(By.id("login-username")).sendKeys(Username);
        driver.findElement(By.id("login-password")).sendKeys(Password);

    }
}

