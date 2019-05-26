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
    private boolean boolAnswer;

    @Given("^today is ([^\"]*)$")
    public void today_is_sunday(String arg) {
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
    @When("^I run numberToWords with argument ([^\"]*)$")
    public void i_run_numberToWords_with_argument(int arg) {
        intArgument = arg;
        stringAnswer = NumberToWords.numberToWords(intArgument);
    }

    @Then("^I expect the answer to be string ([^\"]*)$")
    public void i_expect_the_answer_to_be_string(String expectedAnswer) {
        assertEquals(expectedAnswer, stringAnswer);
    }

    @When("^I run getDigitCount with argument ([^\"]*)$")
    public void i_run_getDigitCount_with_argument(int arg) {
        intArgument = arg;
        intAnswer = NumberToWords.getDigitCount(intArgument);
    }

    @Then("^I expect the answer to be int ([^\"]*)$")
    public void i_expect_the_answer_to_be_int(int expectedAnswer) {
        assertEquals(expectedAnswer, intAnswer);
    }

    @When("^I run reverse with argument ([^\"]*)$")
    public void i_run_reverse_with_argument(int arg) {
        intArgument = arg;
        intAnswer = NumberToWords.reverse(intArgument);
    }

    /**
     * Flour Pack Problem
     *
     */
    @When("I run canPack with args {int} {int} {int}")
    public void i_run_canPack_with_args(int x, int y, int z) {
        boolAnswer = FlourPacker.canPack(x, y, z);
    }

    @Then("^I expect the answer to be true$")
    public void i_expect_the_answer_to_be_true() {
        assertEquals(true, boolAnswer);
    }

    @Then("^I expect the answer to be false$")
    public void i_expect_the_answer_to_be_false() {
        assertEquals(false, boolAnswer);
    }

    /**
     * LargestPrime (factor)
     */

    @When("^I run getLargestPrime with arg ([^\"]*)$")
    public void i_run_getLargestPrime_with_arg(int arg) {
        intArgument = arg;
        intAnswer = LargestPrime.getLargestPrime(intArgument);
    }

    /**
     * DiagonalStar
     */

    @When("^I run printSquareStar with arg ([^\"]*)$")
    public void i_run_printSquareStar_with_arg(int arg) {
        intArgument = arg;
        stringAnswer = DiagonalStar.printSquareStar(arg);
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