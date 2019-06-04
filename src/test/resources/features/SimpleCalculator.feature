Feature: src/test/resources/features/SimpleCalculator.feature

  Scenario: Test SimpleCalculator methods and fields

    Given I initialize simpleCalculator
    When I set simpleCalculator numbers to 5.0 4
    And I run getAdditionResult
    Then I expect the answer to be double 9.0

    When I run getSubtractionResult
    Then I expect the answer to be double 1.0

    When I set simpleCalculator numbers to 5.25 0
    And I run getMultiplicationResult
    Then I expect the answer to be double 0.0

    When I run getDivisionResult
    Then I expect the answer to be double 0.0