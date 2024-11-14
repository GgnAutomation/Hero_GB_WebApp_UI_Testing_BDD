Feature: Zambia BikeFeature

Background:
  Given User open "Zambia" website link
	When Click on "Product"


@BikeFeature @Zambia 
Scenario Outline: <TC_Num> Successfully verify <Bike_Name> bike feature under <Icon_Name> icon 
	Then Click on header "<Icon_Name>" icons and verify bike image
	And Click on header "<Bike_Name>" bike name
	And Verify header bike banner "<Bike_Name>"
	And Click on header highlights "<Bike_Name>" icon  
	And Click on header Colours icon
	And Verify header bike multiple colours
	And Click on download broucher button
	And Click on find a dealer button
  And Click on header specifications icon
  And Verify header multiple specificatios
  And Click on compare variant button "<Bike_Name>"
  And Close browser
    
    Examples: 
      |Bike_Name 					 |Icon_Name	  	 |TC_Num    |
			|Hunter_100					 |moto_taxi      |TC_027		|
			|Hunter_125					 |moto_taxi      |TC_028		|
			|Hunter_150					 |moto_taxi      |TC_029		|
			|Hunter_150TR				 |moto_taxi      |TC_030		|
			|XPULSE_200					 |personal       |TC_031		|
      |Destini_125				 |scooter        |TC_032		|			               
