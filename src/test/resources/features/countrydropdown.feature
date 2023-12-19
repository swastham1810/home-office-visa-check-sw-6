##2.countrydropdown.feature write following scenario
##Scenario: Verify the following country available in country dropdown list
##Given I am on home page
##When I click on start button
##Then I can see following country into dropdown
##|albania|
##|bhutan|
##|british-protected-person|
##|haiti|
##|kazakhstan|
##|mozambique|
##|norway|
##|portugal|
##|russia|
##|zambia|
Feature: Country Dropdown Feature
  In Order to perform dropdown menu feature
  As a User
  I can see the country dropdown list

  @Asha @Regression @Smoke @Sanity
  Scenario: User should verify the following country available in country dropdown list
    Given   User is on Home page
    When    User click on start button
    Then    User can see following country into dropdown
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |