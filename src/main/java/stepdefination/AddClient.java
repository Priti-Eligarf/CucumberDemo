package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static stepdefination.Hooks.getDriver;

public class AddClient {
    WebDriver driver;

    @Given("I am on add customer page")
    public void i_am_on_add_customer_page() {
        System.out.println("Login Page");
//        driver =new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://stock.scriptinglogic.in/");
//        driver.findElement(By.id("login-username")).sendKeys("Admin");
//        driver.findElement(By.id("login-password")).sendKeys("Admin");
//        driver.findElement(By.name("submit")).click();
        driver= getDriver();

        driver.findElement(By.linkText("Add Customer")).click();
    }

    @When("I Enter {},{},{},{}")
    public void i_enter_details(String name, String address, String contact1,String contact2){

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);
    }

//    @When("I Enter John Doe , {int} Maple Street Springfield IL , {int} , {int}")
//    public void i_enter_john_doe_maple_street_springfield_il(Integer int1, Integer int2, Integer int3) {
//
//            }
    @When("I click on add button")
    public void i_click_on_add_button() {
        driver.findElement(By.name("Submit")).click();

         }
    @Then("customer should be added")
    public void customer_should_be_added() {

          }


}
