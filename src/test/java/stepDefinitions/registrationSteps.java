package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class registrationSteps {
    public WebDriver driver;

    @Given("^user navigates to the website$")
    public void userNavigatesToTheWebsite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        driver.findElement(By.xpath("//*[@id=\"accept-cookie-policy\"]")).click();
    }

    @And("^user clicks on Demo Site button$")
    public void userClicksOnDemoSiteButton() {
        driver.findElement(By.xpath("//*[contains(text(),'Demo Site'")).click();
    }

    @And("^user clicks on the Forms$")
    public void userClicksOnTheForms() {
        String oloTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(By.xpath("//*[contains(text),'Forms')]")).click();
    }

    @And("^user clicks on Practice form button$")
    public void userClicksOnPracticeFormButton() {
    }

    @And("^user enters first name \"([^\"]*)\"$")
    public void userEntersFirstName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user enters last name \"([^\"]*)\"$")
    public void userEntersLastName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user enters email address \"([^\"]*)\"$")
    public void userEntersEmailAddress(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects gender option$")
    public void userSelectsGenderOption() {
    }

    @And("^user enters mobile number \"([^\"]*)\"$")
    public void userEntersMobileNumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects hobbies$")
    public void userSelectsHobbies() {
    }

    @And("^user enters address \"([^\"]*)\"$")
    public void userEntersAddress(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects state$")
    public void userSelectsState() {
    }

    @And("^user selects city$")
    public void userSelectsCity() {
    }

    @When("^user clicks on the Submit button$")
    public void userClicksOnTheSubmitButton() {
    }

    @Then("^the form is submitted successfully$")
    public void theFormIsSubmittedSuccessfully() {
    }

    @And("^user clicks on the close button$")
    public void userClicksOnTheCloseButton() {
    }
}

