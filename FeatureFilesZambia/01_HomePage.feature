Feature: HomePage

  @HomePage @Zambia
  Scenario: TC_001 Successfully open global website link
    Given User open "Zambia" website link
    When Verify country name should be displayed
    Then Close browser

  @HomePage @Zambia
  Scenario: TC_002 Successfully verify all header menu icons
 	  Given "Company_logo" icon name should be displayed	
 	   And "Product" icon name should be displayed		
 	   And "Dealers" icon name should be displayed		
 	   And "Service" icon name should be displayed		
 	   And "About_hero" icon name should be displayed	
    And Close browser
    
   @HomePage @Zambia
  Scenario Outline: <TC_Num> Click on <Icon_Name>
    Given "<Icon_Name>" icon name should be displayed	
 	  Given Click on "<Icon_Name>"
    And Close browser
    
    Examples: 
      |Icon_Name	  |TC_Num       |
      |Company_logo   |TC_003		|
      |Product        |TC_004		|	
      |Dealers 	      |TC_005	    |
      |Service        |TC_006		|	
      |About_hero     |TC_007		|	

  @HomePage @Zambia
  Scenario: TC_008 Click on country icon
    Given Verify country name should be displayed
    When Click on country icon
    And Close browser

  @HomePage @Zambia
  Scenario: TC_009 Verify home page text content
    Given Verify home page text should be displayed
    And Close browser

  @HomePage @Zambia
  Scenario: TC_010 Verify home page moto taxi , personal and scooter bikes
    Given Verify home page moto taxi All bikes should be displayed
    When Verify home page personal All bikes should be displayed
    Then Verify home page All scooter should be displayed
    And Close browser

  @HomePage @Zambia
  Scenario Outline: <TC_Num> Verify home page <Bike_Name> bike expanded card under <Icon_Name> icon
    Given User open "Zambia" website link
    When Click on homepage "<Icon_Name>" icons 
    Then Click on "<Bike_Name>" bike name and verify expanded card info
    And Close browser
    
    Examples: 
      |Bike_Name 		 |Icon_Name	  	|TC_Num     |
      |Hunter100		 |moto_taxi     |TC_011		|
      |Hunter125		 |moto_taxi     |TC_012		|	
      |Hunter150		 |moto_taxi     |TC_013		|
      |Hunter150TR	     |moto_taxi     |TC_014		|
      |XPULSE200	     |personal      |TC_015	    |
      |Destini125        |scooter       |TC_016		|
   
  @HomePage @Zambia
  Scenario: TC_017 Verify home page promotion banner
    Given User open "Zambia" website link
    When Verify promotion banner it should be displayed
    And Close browser 
  
  @HomePage @Zambia  
  Scenario: TC_018 Verify home page let us call you back form mandatory field
    Given Click on submit button
    When Verify all mandatory field should be displayed
    And Close browser
  
  @HomePage @Zambia  
  Scenario: TC_019 Successfully fill home page let us call you back form
    Given User able to enter "customer_name"
    When User able to enter "mobile_number"
    Then User able to enter "email_id"
    And User able to enter "city"
    And Click submit enquiry button
    And Verify successfully submit form 
    And Close browser    
  
  @HomePage @Zambia  
  Scenario: TC_020 Verify home page marketing advertisement banner text
    Given Verify "1st" marketing advertisement line text
    When Verify "2nd" marketing advertisement line text
    And Close browser   
  
  @HomePage2 @Zambia  
  Scenario: TC_021 Verify home page footer link inside the product all icons rediretions
    Given Verify "moto_taxi" icon redirection
    And Verify "personal" icon redirection
    And Verify "scooter" icon redirection
    And Close browser      
  
  @HomePage @Zambia  
  Scenario: TC_022 Verify home page footer link inside the support all icons rediretions
    Given Verify "reach_us" icon redirection
    And Verify "request_a_call" icon redirection
    And Verify "become_a_dealer" icon redirection
    And Close browser      
  
  @HomePage @Zambia  
  Scenario: TC_023 Verify home page footer link facebook and instagram logo
    Given User open "Zambia" website link
    When Verify logo
    And Close browser        
  
  @HomePage @Zambia  
  Scenario: TC_024 Verify home page request a call back popup form mandatory field
    Given Click on submit button1
    When Verify all mandatory field should be displayed1
    And Close browser   
  
  @HomePage @Zambia  
  Scenario: TC_025 Successfully fill home page let us call you back popup form
    Given User able to enter "customer_name1"    
    And User able to enter "mobile_number1"    
    And User able to enter "email_id1"   
    And User able to enter "city1"
    And Click submit enquiry button1
    And Verify successfully submit form1 
    And Close browser  
  
  @HomePage @Zambia  
  Scenario: TC_026 Verify home page find a dealer icon and redirection
    Given User open "Zambia" website link
    When Click on find a dealer icon
    Then Verify dealer page 
    And Close browser 
   
	@HomePage @Zambia
	Scenario: TC_027 Successfully verify all product image icons
    Given User open "Zambia" website link
	  When "Company_logo" icon name should be displayed	
		And Click on banner "All_banner_icon"	
		And Close browser 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
