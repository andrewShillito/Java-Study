# Created by Andrew Shillito at 5/25/2019
Feature: Is it Friday yet?
  Everybody wants to know when it is Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told no
    
  Scenario: Today is Friday
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told yes