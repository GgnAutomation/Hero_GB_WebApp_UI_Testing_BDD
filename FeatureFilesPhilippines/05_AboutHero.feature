Feature: Zambia About Hero



	@AboutHero @Philippines
	Scenario: TC_033 verify about hero right side image close button and find a delear redirection
    Given User open "Philippines" website link
		When Click on "About_hero"
		Then Verify right side static image
		And Click on about hero close icon
		And Click on "About_hero"
		And Click on find a delear
		And Verify dealer page 
		And Close browser
			
	@AboutHero @Philippines
	Scenario: TC_034 verify about hero page
    Given User open "Philippines" website link
		When Click on "About_hero"
		Then Click on About Hero page
		And Verify About Hero page in new window and close
		And Click on Reach us icon
		And Verify Reach us page
		And Click on Become a delear icon
		And Verify Become a delear page
		And Click on About Terrafirma Motors Corporation icon and verify page
		And Close browser
			
	@AboutHero @Philippines
	Scenario: TC_035 verify about hero become a dealer page form
    Given User open "Philippines" website link
		When Click on "About_hero"
		Then Click on Become a delear icon
		And Fill personal details "Philippines"
		And Fill contact details "Philippines"
		And Click on Submit button and verify Thank you pop up
		And Close browser
			
	@AboutHero @Philippines
	Scenario: TC_036 verify share holder details in become a dealer page form
    Given User open "Philippines" website link
		When Click on "About_hero"
		Then Click on Become a delear icon
		And Fill personal details "Philippines"
		And Fill contact details "Philippines"
		And Fill existing business details
		And Fill share holder details
		And Click on Submit button and verify Thank you pop up
		And Close browser
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		