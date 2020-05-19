package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDefs {
    WebDriver driver;
    @Given("open browser")
    public void open_browser() throws InterruptedException {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver= new ChromeDriver();

//        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
//        driver= new FirefoxDriver();
        Thread.sleep(5000);
           }

    @When("Enter url")
    public void enter_url() {
        driver.get("https://www.google.com");

    }

    @When("Enter UId And pw")
    public void enter_UId_And_pw() {
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Images")).click();

        System.out.println("clicked on images");

    }

    @Then("CLick on enter")
    public void click_on_enter() {
        driver.manage().window().maximize();
        System.out.println("browser maximised");
        driver.close();
        System.out.println("browser closed");

    }

}
