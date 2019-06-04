Feature: Test PaintJob Script
  
  Scenario: I run function getBucketCount

    # Four arg func

    When I run getBucketCount with 4 args -3.4 2.1 1.5 2
    Then I expect the answer to be int -1
    
    When I run getBucketCount with 4 args 3.4 2.1 1.5 2
    Then I expect the answer to be int 3
    
    When I run getBucketCount with 4 args 2.75 3.25 2.5 1
    Then I expect the answer to be int 3

    # Three arg func

    When I run getBucketCount with 3 args -3.4 2.1 1.5
    Then I expect the answer to be int -1
    
    When I run getBucketCount with 3 args 3.4 2.1 1.5
    Then I expect the answer to be int 5
    
    When I run getBucketCount with 3 args 7.25 4.3 2.35
    Then I expect the answer to be int 14

    # Two arg func

    When I run getBucketCount with 2 args 3.4 1.5
    Then I expect the answer to be int 3

    When I run getBucketCount with 2 args 6.26 2.2
    Then I expect the answer to be int 3

    When I run getBucketCount with 2 args 3.26 0.75
    Then I expect the answer to be int 5