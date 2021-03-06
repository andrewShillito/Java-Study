# Created by Andrew Shillito at 5/26/2019
Feature: Testing DiagonalStar class printSquareStar func
  Testing returned strings from printSquareStar

  Scenario: I run printSquareStar

    When I run printSquareStar with arg 5
    Then I expect the answer to be string *****, ** **, * * *, ** **, *****
    
    When I run printSquareStar with arg 8
    Then I expect the answer to be string ********, **    **, * *  * *, *  **  *, *  **  *, * *  * *, **    **, ********

    When I run printSquareStar with arg 4
    Then I expect the answer to be string Invalid Value

    When I run printSquareStar with arg -1
    Then I expect the answer to be string Invalid Value