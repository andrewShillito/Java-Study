package Main;

import static org.junit.Assert.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMyRegex {

    boolean[] boolArray;
    MyRegex myRegex = new MyRegex();

    @When("^I run myRegex testCases$")
    public void i_run_myRegex_test_cases() {
        String[] testCases = myRegex.getTestCases();
        boolArray = new boolean[testCases.length];
        for (int i = 0; i < testCases.length; i++) {
            boolArray[i] = myRegex.runTestCase(testCases[i]);
        }
    }

    @Then("^I expect boolean array to be correct$")
    public void i_expect_boolean_array_to_be_correct() {
        boolean[] expected = {true, true, true, false, false, false};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], boolArray[i]);
        }
    }
}
