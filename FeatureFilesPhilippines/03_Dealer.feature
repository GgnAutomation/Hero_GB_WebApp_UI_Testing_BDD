Feature: Zambia Dealers


	@Dealers @Philippines
  Scenario: TC_027 verify dealers information
    Given User open "Philippines" website link
    When Click on "Dealers"
    Then "Dealers_name , Dealers_address , Dealers_time , Dealers_contact_number" should be displayed
    And Close browser