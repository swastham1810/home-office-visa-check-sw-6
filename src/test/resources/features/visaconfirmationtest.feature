#1.anAustralianCominToUKForTourism.
# Click on start button
#Select a Nationality 'Australia'
#Click on Continue button
#Select reason 'Tourism'
#Click on Continue button verify result 'You will not need a visa to come to the UK'

Feature: Visa Confirmation Feature
  As a user I would like to verify my visa status


  Background: User should click on start button on home page
    Given     User is on Home page
    When      User click on start button

  @Asha @Sanity @Smoke @Regression
  Scenario: User should be an Australian Coming To UK For Tourism
    And     User select nationality "Australia"
    And     User click on continue button
    And     User select reason is Tourism
    And     User click on a continue button
    Then    User get a result "You will not need a visa to come to the UK"
#2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths.
    #Click on start button
    #Select a Nationality 'Chile'
    #Click on Continue button
    #Select reason 'Work, academic visit or business'
    #Click on Continue button
    #Select intendent to stay for 'longer than 6 months'
    #Click on Continue button
    #Select have planning to work for 'Health and care professional'
    # Click on Continue button
    # verify result 'You need a visa to work in health and care'

  @Asha @Smoke @Regression
  Scenario: Verify the Visa for a Chile coming to the UK for Work and plans on staying for longer than six months
    And     User select a nationality "Chile"
    And     User click continue button
    And     User select work and academic visit reason is Work, academic visit or business
    And     User click the continue button
    And     User select intended to stay for longer than six months
    And     User click on the continue button
    And     User select have planning to work for Health and care professional
    And     User click a continue button
    Then    User get result "You need a visa to work in health and care"
 #3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAn Article10Or20Card
    #Click on start button
    #Select a Nationality 'Colombia'
    #Click on Continue button
    #Select reason 'Join partner or family for a long stay'
    #Click on Continue button
    #Select state My partner of family member have uk immigration status 'yes'
    # Click on Continue button
    # verify result 'You’ll need a visa to join your family or partner in the UK'
  @Asha @Regression
  Scenario: User should navigate to homepage successfully
    And     User select The nationality "Cambodia"
    And     User clicks on continue button
    And     User select join partner reason is Join partner or family for a long stay
    And     User clicks on the continue button
    And     User select state My partner of family member have uk immigration status is yes
    And     User clicks the continue button
    Then    User get the result "You’ll need a visa to join your family or partner in the UK"