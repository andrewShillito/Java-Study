# Created by Andrew Shillito at 5/25/2019
Feature: Is it Friday yet?
  Everybody wants to know when it is Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whther it's Friday yet
    Then I should be told "Nope"