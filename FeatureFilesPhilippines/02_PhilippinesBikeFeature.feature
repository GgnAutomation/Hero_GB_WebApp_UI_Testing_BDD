Feature:  BikeFeature

Background:
  Given User open "Philippines" website link
	When Click on "Product"


@BikeFeature @Philippines 
Scenario Outline: <TC_Num> Successfully verify <Bike_Name> bike feature under <Icon_Name> icon 
	Then Click on header "<Icon_Name>" icons and verify bike image
	And Click on header "<Bike_Name>" bike name
	And Verify header bike banner "<Bike_Name>"
	And Click on header highlights "<Bike_Name>" icon  
	And Click on header Colours icon
	And Verify header bike multiple colours
	And Click on download broucher button1 "<Bike_Name>"
	 #exclude only xoom 110 scooter
	And Click on find a dealer button
  And Click on header specifications icon
  And Verify header multiple specificatios
  And Close browser
    
    Examples: 
      |Bike_Name 					 |Icon_Name	   |TC_Num    |
			|Xpulse2004V				 |premium      |TC_024		|
			|Hunk160R4V					 |premium      |TC_025		|
			|Xoom110				  	 |P_scooter    |TC_026		|