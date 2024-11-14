Feature: Zambia Dealers


	@Dealers @Zambia
  Scenario: TC_033 verify dealers information
    Given User open "Zambia" website link
    When Click on "Dealers"   
    Then "Dealers_name" should be displayed
    And "Dealers_address" should be displayed
    And "Dealers_time" should be displayed
    And "Dealers_contact_number" should be displayed
    And Close browser
    