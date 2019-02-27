package com.lay.poc.weekdays;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Stepdefs {
    private String today;
    private boolean isFriday;

    @Given("^today is Sunday$")
    public void today_is_Sunday() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException(); // Exception helps to remind that job not completed
        today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        isFriday = Friday.isFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        assertFalse(isFriday);
    }

    @Then("^I should be told false$")
    public void i_should_be_told_false() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertFalse(isFriday);
    }

    @Given("^today is friday$")
    public void today_is_friday() throws Exception {
        today = "friday";
    }

    @Then("^I should be told true$")
    public void i_should_be_told_true() throws Exception {
        assertTrue(isFriday);
    }

    @Given("^\"([^\"]*)\" is friday$")
    public void is_friday(String arg1) throws Exception {
        today = arg1;
    }

}
