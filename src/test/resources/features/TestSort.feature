# Created by Andrew Shillito at 6/29/2019
Feature: Test sorting functions in class Main.Sort
  # Enter feature description here

  Scenario: Test Merge Sort Function
    # for now just randomized arr/string generation

    # sorting int arrays
    When I run testMergeSort int
    Then I expect the result to be sorted

    When I run testMergeSort int
    Then I expect the result to be sorted

    When I run testMergeSort int
    Then I expect the result to be sorted

    When I run testMergeSort int with length 10
    Then I expect the result to be sorted

    # sorting Strings
    When I run testMergeSort String
    Then I expect the String to be sorted

    When I run testMergeSort String
    Then I expect the String to be sorted

    When I run testMergeSort String with length 10
    Then I expect the String to be sorted

    When I run testMergeSort String with length 10
    Then I expect the String to be sorted

    # sorting String arrays
    When I run testMergeSort String Array
    Then I expect the String Array to be sorted

    When I run testMergeSort String Array
    Then I expect the String Array to be sorted

    When I run testMergeSort String Array with length 10
    Then I expect the String Array to be sorted

    When I run testMergeSort String Array with length 10
    Then I expect the String Array to be sorted


    