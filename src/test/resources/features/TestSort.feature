# Created by Andrew Shillito at 6/29/2019
Feature: Test sorting functions in class Main.Sort
  # Enter feature description here

  Scenario: Test Merge Sort Function
    # for now just randomized arr generation
    When I run testMergeSort int
    Then I expect the result to be sorted

    When I run testMergeSort int
    Then I expect the result to be sorted

    When I run testMergeSort int
    Then I expect the result to be sorted

    When I run testMergeSort int with length 10
    Then I expect the result to be sorted
    