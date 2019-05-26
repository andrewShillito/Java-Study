# Created by Andrew Shillito at 5/26/2019
Feature: Run Largest Prime Factor function
  Test largest prime factor function

  Scenario: I run function getLargestPrime

    When I run getLargestPrime with arg 21
    Then I expect the answer to be int 7

    When I run getLargestPrime with arg 217
    Then I expect the answer to be int 31

    When I run getLargestPrime with arg 0
    Then I expect the answer to be int -1

    When I run getLargestPrime with arg -1
    Then I expect the answer to be int -1

    When I run getLargestPrime with arg 1
    Then I expect the answer to be int -1

    When I run getLargestPrime with arg 45
    Then I expect the answer to be int 5

    When I run getLargestPrime with arg 7
    Then I expect the answer to be int 7
