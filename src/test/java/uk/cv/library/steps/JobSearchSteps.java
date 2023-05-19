package uk.cv.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.cv.library.pages.HomePage;
import uk.cv.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws InterruptedException{
        new HomePage().clickOnAcceptCookies();
    }
    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)  {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)  {
        new HomePage().selectDistance(distance);

    }

    @And("^I click on more search option link$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter min salary \"([^\"]*)\"$")
    public void iEnterMinSalary(String salaryMin)  {
        new HomePage().enterMinSalary(salaryMin);

    }

    @And("^I enter max salary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String salaryMax)  {
        new HomePage().enterMaxSalary(salaryMax);

    }

    @And("^I select salary type\"([^\"]*)\"$")
    public void iSelectSalaryType(String argO)  {


    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String argO)  {


    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }


    @Then("^I should be able to see result \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeResult(String result) {
        new ResultPage().verifyTheResults(result);
    }
}
