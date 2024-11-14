Feature: Bangladesh BikeFeature

Background:
  Given User open "Bangladesh" website link
	When Click on "Product"

# All bike features file
# //    Commuter all 5 bikes 

@BikeFeatureTest @Bangladesh 
Scenario Outline: <TC_Num> Successfully verify <Bike_Name> bike feature under <Icon_Name> icon 
	Then Click on "<Icon_Name>" icons
	And Click on "<Bike_Name>" bike name
	# for premium bike condition apply due to xpath chg
	And Click on highlights "<Icon_Name>" icon  
	And Click on Colours icon
	And Verify bike multiple colours
	And Click on price icon
	And Verify bike price
  And Click on specifications icon
  And Verify multiple specificatios
  And Click on EMI icon
  And Verify all EMI option
  And Click on Gallery icon
  And Close browser
    
    Examples: 
      |Bike_Name 					 |Icon_Name	  	|TC_Num   |
      |Hf_Deluxe					 |commuter 		  |TC_011		|
      |Splendor+SE				 |commuter      |TC_012		|
      |Splender+_XTEC		   |commuter 		  |TC_013		|
      |Passion_XPRO			   |commuter      |TC_014		|
      |Passion_XPRO_XTEC	 |commuter 		  |TC_015		|
      |Glamour    			   |executive     |TC_016		|
      |Ignitor_techno			 |executive     |TC_017		|
      |Ignitor_XTEC				 |executive     |TC_018		|
      |Thriller_160R_4V	   |Premium       |TC_019		|
      |Hunk_150				     |Premium       |TC_020		|
      |Hunk_150R			     |Premium       |TC_021   | 
      |Thriller_160R			 |Premium       |TC_022		|
      |Pleasure  				   |Scooter       |TC_023		|
      |MAESTRO_EDGE_XTEC	 |Scooter       |TC_024		|































	