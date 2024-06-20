package stepdefination;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class userRegistration {
    WebDriver driver;
    
//    @Given("I am on user registration page")
//    public void i_am_on_user_registration_page() {
//
//    }

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("Login Page");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.net/contact/");
    }
    @When("I enter below details")
    public void i_enter_below_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        List<List<String>> data = dataTable.asLists();
        driver.findElement(By.xpath("//input[@id='field_rgden']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@id='field_psuor']")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[@id='field_rmejg']")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//input[@id='field_es5y1']")).sendKeys(data.get(0).get(3));


    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("submit button");

    }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("should be added");
    }

}
