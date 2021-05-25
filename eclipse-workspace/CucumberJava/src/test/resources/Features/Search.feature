Feature: feature to test search feature on flipkart page

  Scenario: Check functionality of search button
  
    Given User has to search for iPhone within particular range
    When User enters product name
    And Clicks on search button
    Then User gets navigated to mobiles and accessories page
    And User selects price range and brand name
    Then User gets navigated to page showing multiple results for iPhone sorted by selected price range
    
    
    