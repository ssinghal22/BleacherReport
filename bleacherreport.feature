@bleacherreport
Feature: Bleacher Report smoke test suite

  @bleacherreport1
  Scenario: BR Home page smoke test
    Given I open BR home page
    Then header displays
    And a big image displays

   # And a video plays in background
    # Then I click close button on video

    And My Teams displays
    And Edit Teams displays
    And Headlines displays
    And Trending displays
    And Exclusive displays
    And Social icons display in footer
    And Links display in footer
