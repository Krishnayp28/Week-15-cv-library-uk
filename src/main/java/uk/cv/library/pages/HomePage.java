package uk.cv.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.cv.library.utility.Utility;

public class HomePage extends Utility {


        private static final Logger log = LogManager.getLogger(HomePage.class.getName());

        public HomePage() {
            PageFactory.initElements(driver, this);
        }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptions;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;


    public void clickOnAcceptCookies() throws InterruptedException {
        Thread.sleep(800);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);
        log.info("Accept All Cookies : " + acceptAllCookies.toString());

    }

    public void enterJobTitle(String jobTitle) {
        log.info("Enter Job Title:" + jobTitle.toString());
        sendTextToElement(this.jobTitle, jobTitle);

    }

    public void enterLocation(String location) {
        log.info("Enter Location:" + location.toString());
        sendTextToElement(this.location, location);

    }

    public void selectDistance(String distance) {
        log.info("Select Distance :" + distanceDropDown.toString());
        sendTextToElement(distanceDropDown, distance);

    }

    public void clickOnMoreSearchOptionLink() {
        log.info("click On More Search Option :" + moreSearchOptions.toString());
        clickOnElement(moreSearchOptions);

    }

    public void enterMinSalary(String minSalary) {
        log.info("Enter MinSalary:" + minSalary.toString());
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter MaxSalary :" + maxSalary.toString());
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryType(String sType) {
        log.info("Select Salary Type:" + salaryDropDown.toString());
        selectByVisibleTextFromDropDown(salaryDropDown, sType);

    }

    public void selectJobType(String jobType) {
        log.info("Select Job Type:" + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }

    public void clickOnFindJobsButton() {
        log.info("click On Find Jobs Button :" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);

    }
}
