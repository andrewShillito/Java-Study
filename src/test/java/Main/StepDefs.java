package Main;

import cucumber.api.java.en.And;
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
    private double doubleAnswer;
    private double doubleArgument;
    private boolean boolAnswer;

    private SimpleCalculator simpleCalculator;

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

    @When("^I run getBucketCount with 4 args ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*)$")
    public void i_run_getBucketCount_with_4_args(double width, double height, double areaPerBucket, int extraBuckets) {
        intAnswer = PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckets);
    }

    @When("^I run getBucketCount with 3 args ([^\"]*) ([^\"]*) ([^\"]*)$")
    public void i_run_getBucketCount_with_3_args(double width, double height, double areaPerBucket) {
        intAnswer = PaintJob.getBucketCount(width, height, areaPerBucket);
    }

    @When("^I run getBucketCount with 2 args ([^\"]*) ([^\"]*)$")
    public void i_run_getBucketCount_with_2_args(double area, double areaPerBucket) {
        intAnswer = PaintJob.getBucketCount(area, areaPerBucket);
    }

    @Given("^I initialize simpleCalculator$")
    public void i_intialize_simpleCalculator() {
        this.simpleCalculator = new SimpleCalculator();
    }

    @And("^I set simpleCalculator numbers to ([^\"]*) ([^\"]*)$")
    public void i_set_simpleCalculator_numbers_to(double firstNum, double secondNum) {
        this.simpleCalculator.setFirstNumber(firstNum);
        this.simpleCalculator.setSecondNumber(secondNum);
    }

    @When("^I run getAdditionResult$")
    public void i_run_getAdditionResult() {
        this.doubleAnswer = this.simpleCalculator.getAdditionResult();
    }

    @Then("^I expect the answer to be double ([^\"]*)$")
    public void i_expect_the_answer_to_be_double(double expectedAnswer) {
        assertEquals(expectedAnswer, this.doubleAnswer, .0001);
    }

    @When("^I run getSubtractionResult$")
    public void i_run_getSubtractionResult() {
        this.doubleAnswer = this.simpleCalculator.getSubtractionResult();
    }

    @When("^I run getMultiplicationResult$")
    public void i_run_getMultiplicationResult() {
        this.doubleAnswer = this.simpleCalculator.getMultiplicationResult();
    }

    @When("^I run getDivisionResult$")
    public void i_run_getDivisionResult() {
        this.doubleAnswer = this.simpleCalculator.getDivisionResult();
    }

    @Then("^I expect getFirstNumber to return ([^\"]*)$")
    public void i_expect_getFirstNumber_to_return(double expectedAnswer) {
        assertEquals(expectedAnswer, this.doubleAnswer, .0001);
    }

    @Then("^I expect getSecondNumber to return ([^\"]*)$")
    public void i_expect_getSecondNumber_to_return(double expectedAnswer) {
        assertEquals(expectedAnswer, this.doubleAnswer, .0001);
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