Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told false

  Scenario: friday is Friday
    Given today is friday
    When I ask whether it's Friday yet
    Then I should be told true

  Scenario: fri is Friday
    Given "fri" is friday
    When I ask whether it's Friday yet
    Then I should be told true

  Scenario: Fri is Friday
    Given "Fri" is friday
    When I ask whether it's Friday yet
    Then I should be told true

  Scenario: Sat isn't Friday
    Given "Sat" is friday
    When I ask whether it's Friday yet
    Then I should be told false
