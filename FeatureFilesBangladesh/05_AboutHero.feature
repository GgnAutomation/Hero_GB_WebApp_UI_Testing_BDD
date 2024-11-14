Feature: AboutHero


	 
@AboutHero @Bangladesh
Scenario: TC_028 Successfully click on About Hero icon
  Given User open "Bangladesh" website link
		When Click on "About_hero"
  Then Click on About Hero page
	And Verify About Hero page in new window and close
	And Click on About Niloy Bangladesh Ltd icon
	And Verify About Niloy Bangladesh Ltd page
	And Click on Reach us icon
	And Verify Reach us page
	And Click on Become a delear icon
	And Verify Become a delear page
	And Click on investor icon
	And Verify investor page
  And Close browser