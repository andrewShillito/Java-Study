package Main;

import java.util.Arrays;
import static org.junit.Assert.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSort {

    private int[] expectedResult;
    private int[] actualResult;

    public int[] generateArray() {
        //default length is 5
        return generateArray(5);
    }

    public int[] generateArray(int length) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*5);
        }
        return arr;
    }

    @When("^I run testMergeSort int$")
    public void i_run_test_merge_sort_int() {
        i_run_test_merge_sort_int_with_length(5);
    }

    @When("^I run testMergeSort int with length ([^\"]*)$")
    public void i_run_test_merge_sort_int_with_length(int length) {
        int[] arr = generateArray(length);
        expectedResult = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expectedResult);
        actualResult = Sort.mergeSort(arr);
    }

    @Then("^I expect the result to be sorted$")
    public void i_expect_the_result_to_be_sorted(){
        assertArrayEquals(expectedResult, actualResult);
    }
}
