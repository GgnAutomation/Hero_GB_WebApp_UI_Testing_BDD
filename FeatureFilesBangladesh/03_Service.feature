Feature: Service


	
@Service @Bangladesh
Scenario: TC_025 Successfully click on dealers icon
  Given User open "Bangladesh" website link  
  When Click on dealers icon
	Then Verify locate a dealer page text
	And Verify category dropdown 
	And Verify district dropdown
	And Verify Search button
  And Close browser

@Service @Bangladesh
Scenario: TC_026 Successfully click on service icon
  Given User open "Bangladesh" website link 
  When Click on service icon
	Then Click on Maintenance Tips icon
	And Click on warranty icon
	And Click on two wheeler tips icon
	And Click on owners manual icon
	And Click on hero joy ride icon
	And Click on Diy videos icon
	And Click on Hero genuine parts icon
  And Close browser
