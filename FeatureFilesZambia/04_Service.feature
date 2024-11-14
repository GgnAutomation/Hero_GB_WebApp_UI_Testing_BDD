Feature: Zambia Service



	@Service @Zambia
	Scenario: TC_034 verify Close button under service icon
    Given User open "Zambia" website link
		When Click on "Service"
		Then Click on close icon
		And Close browser
		
	@Service @Zambia
	Scenario: TC_035 verify service and maintenance tips all information
		Given Click on "Service"
		When Click on service and maintenance tips
		Then Verify header line three icons
		And Verify service schedule and dropdown five bikes
		And select any bikes and verify bikes servicing information it should be displayed
		And Close browser
		
	@Service @Zambia
	Scenario: TC_036 verify pre ride inspection guide under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on pre ride inspection guide
		Then Verify all inspection guide
		And Close browser
		
	@Service @Zambia
	Scenario: TC_037 verify fuel saving tips under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on fuel saving tips
		Then Verify all fuel saving tips
		And Close browser
		
	@Service @Zambia
	Scenario: TC_038 verify hero genuine parts
		Given Click on hero genuine parts
		When Verify hero genuine parts page information
		And Close browser