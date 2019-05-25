package Main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class StepDefs {

    private String today;
    private String stringAnswer;
    private String stringArgument;
    private int intAnswer;
    private int intArgument;

    @Given("^today is ([^\"]*)$")
    public void today_is(String arg) {
        today = arg;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        stringAnswer = IsItFriday.isItFriday(today);
    }


    @Then("^I should be told ([^\"]*)$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, stringAnswer);
    }

    /**
     * Run Number to Words
     * @param arg
     */
    @Given("^I run numberToWords with argument ([^\"]*)$")
    public void i_run_numberToWords_with_argument(int arg) {
        intArgument = arg;
        stringAnswer = NumberToWords.numberToWords(intArgument);
    }

    @Then("^I expect the answer to be string ([^\"]*)$")
    public void i_expect_the_answer_to_be(String expectedAnswer) {
        assertEquals(stringAnswer, expectedAnswer);
    }

    @Given("^I run getDigitCount with argument ([^\"]*)$")
    public void i_run_getDigitCount_with_argument(int arg) {
        intArgument = arg;
        intAnswer = NumberToWords.getDigitCount(intArgument);
    }

    @Then("^I expect the answer to be int ([^\"]*)$")
    public void i_expect_the_answer_to_be(int expectedAnswer) {
        assertEquals(intAnswer, expectedAnswer);
    }

    @Given("^I run reverse with argument ([^\"]*)$")
    public void i_run_reverse_with_argument(int arg) {
        intArgument = arg;
        intAnswer = NumberToWords.reverse(intArgument);
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "yes";
        } else {
            return "no";
        }
    }
}