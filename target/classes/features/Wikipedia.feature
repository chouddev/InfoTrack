Feature:  Verification of the Wikipedia page
Scenario: Check the Search bar in the Wikipedia Page
Given I Navigate to Wikipedia Home page 
    When I search for "Shane" in the search bar 
    And I click on the Search icon
    Then Search results are displayed 
    And Browser is closed
    
Scenario: Check that the home page has section In the news
Given I Navigate to Wikipedia Home page 
    Then I search for In the news section
    And Browser is closed
   
Scenario: Check that in the logo Wikipedia is clicable 
Given I Navigate to Wikipedia Home page 
		When I capture the welcome home page 
    Then I check Wikipedia link is clickable
    And Browser is closed
    

 Scenario: Check the count of the sister projects
	Given I Navigate to Wikipedia Home page  
	 Then   I check that the count of sister projects is "12"
	 And Browser is closed
 
    
   
 