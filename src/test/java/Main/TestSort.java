package Main;

import java.util.Arrays;
import static org.junit.Assert.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSort {

    private int[] expectedResult;
    private int[] actualResult;

    private String expectedString;
    private String actualString;

    private String[] expectedStringArray;
    private String[] actualStringArray;

    private final String stringAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

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

    @When("^I run testMergeSort String$")
    public void i_run_test_merge_sort_String() {
        i_run_test_merge_sort_int_with_length(5); // default length is 5
    }

    @When("^I run testMergeSort String with length ([^\"]*)$")
    public void i_run_test_merge_sort_String_with_length(int length) {
        String generatedString = generateString(length);

        char[] tempArray = generatedString.toCharArray();
        Arrays.sort(tempArray);
        expectedString = new String(tempArray);

        actualString = Sort.mergeSort(generatedString);
    }

    public String generateString() {
        return generateString(5); // default length is 5
    }

    public String generateString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random()*52);
            sb.append(stringAlphabet.charAt(rand));
        }
        return sb.toString();
    }

    @Then("^I expect the String to be sorted$")
    public void i_expect_the_String_to_be_sorted(){
        assertEquals(expectedString, actualString);
    }

    public String[] generateStringArray() {
        return generateStringArray(5); // 5 is default length
    }

    public String[] generateStringArray(int length) {
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generateString(); // will be equal length strings (5 chars)
        }
        return arr;
    }

    @When("^I run testMergeSort String Array$")
    public void i_run_test_merge_sort_string_array() {
        i_run_test_merge_sort_string_array_with_length(5); // 5 is default length
    }

    @When("^I run testMergeSort String Array with length ([^\"]*)$")
    public void i_run_test_merge_sort_string_array_with_length(int length) {
        String[] arr = generateStringArray(length);
        expectedStringArray = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(expectedStringArray);
        actualStringArray = Sort.mergeSort(Arrays.copyOfRange(arr, 0, arr.length));
    }

    @Then("^I expect the String Array to be sorted$")
    public void i_expect_the_string_array_to_be_sorted() {
        assertArrayEquals(expectedStringArray, actualStringArray);
    }
}
