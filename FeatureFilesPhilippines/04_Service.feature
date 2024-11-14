Feature: Zambia Service



	@Service @Philippines
	Scenario: TC_028 verify Close button under service icon
    Given User open "Philippines" website link
		When Click on "Service"
		Then Click on close icon
		And Close browser
		
	@Service @Philippines
	Scenario: TC_029 verify service and maintenance tips all information
    Given User open "Philippines" website link
		When Click on "Service"
		When Click on maintenance tips
		Then Verify header line four icons
		And Verify service schedule and dropdown three bikes
		And select any bikes and verify bikes servicing information it should be displayed
		And Close browser
		
	@Service @Philippines
	Scenario: TC_030 verify pre ride inspection guide under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on pre ride inspection guide
		Then Verify all inspection guide
		And Close browser
		
	@Service @Philippines
	Scenario: TC_031 verify care and maintenance under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on care and maintenance
		And Verify all care and maintenance
		And Close browser
		
	@Service @Philippines
	Scenario: TC_032 verify hero genuine parts
		Given Click on hero genuine parts
		When Verify hero genuine parts page information
		And Close browser