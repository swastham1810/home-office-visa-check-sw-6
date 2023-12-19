package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComingToUKSteps {
    @Given("User is on Home page")
    public void userIsOnHomePage() {
        System.out.println("User is on homepage");
    }

    @When("User click on start button")
    public void userClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("User select nationality {string}")
    public void userSelectNationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("User click on continue button")
    public void userClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("User select reason is Tourism")
    public void userSelectReasonIsTourism() {
        new ReasonForTravelPage().reasonIsTourismToTravelToUK();
    }

    @And("User click on a continue button")
    public void userClickOnAContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @Then("User get a result {string}")
    public void userGetAResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheTextYouWillNotNeedAVisaToComeToTheUK(), result, "Incorrect result");
    }

    @And("User select a nationality {string}")
    public void userSelectANationality(String nationality1) {
        new SelectNationalityPage().selectNationality(nationality1);
    }

    @And("User click continue button")
    public void userClickContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("User select work and academic visit reason is Work, academic visit or business")
    public void userSelectWorkAndAcademicVisitReasonIsWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().reasonIsWorkAcademicVisitToTravelToUK();
    }

    @And("User click the continue button")
    public void userClickTheContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @And("User select intended to stay for longer than six months")
    public void userSelectIntendedToStayForLongerThanMonths() {
        new DurationOfStayPage().durationToStayInUK();
    }

    @And("User click on the continue button")
    public void userClickOnTheContinueButton() {
        new DurationOfStayPage().clickOnContinueButton();
    }

    @And("User select have planning to work for Health and care professional")
    public void userSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().planningToWorkAsHealthCareProfessional();
    }

    @And("User click a continue button")
    public void userClickAContinueButton() {
        new WorkTypePage().clickOnContinueButton();
    }

    @Then("User get result {string}")
    public void userGetResult(String result1) {
        Assert.assertEquals(new ResultPage().verifyTheTextYouNeedAVisaToWorkInHealthCare(), result1, "Incorrect result");
    }

    @And("User select The nationality {string}")
    public void userSelectTheNationality(String nationality3) {
        new SelectNationalityPage().selectNationality(nationality3);
    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("User select join partner reason is Join partner or family for a long stay")
    public void userSelectJoinPartnerReasonIsJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().reasonIsJoinPartnerOrFamilyForALongStay();
    }

    @And("User clicks on the continue button")
    public void userClicksOnTheContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @And("User select state My partner of family member have uk immigration status is yes")
    public void userSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusIsYes() {
        new FamilyImmigrationStatusPage().familyMemberHaveUKImmigrationStatus();
    }

    @And("User clicks the continue button")
    public void userClicksTheContinueButton() {
        new FamilyImmigrationStatusPage().clickOnContinueButton();
    }

    @Then("User get the result {string}")
    public void userGetTheResult(String result3) {
        Assert.assertEquals(new ResultPage().verifyTheTextYouNeedAVisaToJoinYourFamilyOrPartnerInUK(), result3, "Incorrect result");
    }
}
