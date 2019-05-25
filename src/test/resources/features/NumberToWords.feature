# Created by Andrew Shillito at 5/25/2019
Feature: Number To Words Method Tests
  Test all methods in Number to Words

  Scenario: I run getDigitCount

    Given I run getDigitCount with argument 123
    Then I expect the answer to be int 3
    Given I run getDigitCount with argument 1010
    Then I expect the answer to be int 4
    Given I run getDigitCount with argument 1
    Then I expect the answer to be int 1
    Given I run getDigitCount with argument -1231230
    Then I expect the answer to be int -1
    
  Scenario: I run reverse
    
    Given I run reverse with argument 123
    Then I expect the answer to be int 321
    Given I run reverse with argument 1020
    Then I expect the answer to be int 201
    Given I run reverse with argument -100
    Then I expect the answer to be int -1
    
  Scenario: I run NumberToWords.numberToWords
    
    Given I run numberToWords with argument 123
    Then I expect the answer to be string One Two Three
    Given I run numberToWords with argument 1020
    Then I expect the answer to be string One Zero Two Zero
    Given I run numberToWords with argument -10123
    Then I expect the answer to be string Invalid Value
    