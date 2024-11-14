Feature: Zambia About Hero



	@AboutHero @Zambia
	Scenario: TC_039 verify about hero right side image close button and find a delear redirection
    Given User open "Zambia" website link
		When Click on "About_hero"
		Then Verify right side static image
		And Click on about hero close icon
		And Click on "About_hero"
		And Click on find a delear
		And Verify dealer page 
		And Close browser
			
	@AboutHero @Zambia
	Scenario: TC_040 verify about hero page
    Given User open "Zambia" website link
		When Click on "About_hero"
		Then Click on About Hero page
		And Verify About Hero page in new window and close
		And Click on Reach us icon
		And Verify Reach us page
		And Click on Become a delear icon
		And Verify Become a delear page
		And Click on investor icon
		And Verify investor page			
		And Close browser
			
	@AboutHero @Zambia
	Scenario: TC_041 verify about hero become a dealer page form
    Given User open "Zambia" website link
		When Click on "About_hero"
		Then Click on Become a delear icon
		And Fill personal details "Zambia"
		And Fill contact details "Zambia"
		And Click on Submit button and verify Thank you pop up
		And Close browser
			
	@AboutHero @Zambia
	Scenario: TC_042 verify share holder details in become a dealer page form
    Given User open "Zambia" website link
		When Click on "About_hero"
		Then Click on Become a delear icon
		And Fill personal details "Zambia"
		And Fill contact details "Zambia"
		And Fill existing business details
		And Fill share holder details
		And Click on Submit button and verify Thank you pop up
		And Close browser
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		