# Created by Andrew Shillito at 5/26/2019
Feature: Test Flour Packer Class


  Scenario: I run FlourPacker.canpack
    When I run canPack with args 1 0 4
    Then I expect the answer to be false

    When I run canPack with args 1 0 5
    Then I expect the answer to be true

    When I run canPack with args 0 5 4
    Then I expect the answer to be true

    When I run canPack with args 2 2 11
    Then I expect the answer to be true

    When I run canPack with args -3 2 12
    Then I expect the answer to be false

    When I run canPack with args 0 5 5
    Then I expect the answer to be true

    When I run canPack with args 5 3 24
    Then I expect the answer to be false