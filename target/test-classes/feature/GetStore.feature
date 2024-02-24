#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: View Store Detail

  @regression
  Scenario: Get All Store Details
    Given the api is available
    When endpoint "/stores" is invoked
    Then the response should come with a status code of 200
    
     @regression
  Scenario: Validate response when incorrect endpoint for get Stores
    Given the api is available
    When endpoint "/store" is invoked
    Then the response should come with a status code of 404
    
     
     @regression 
  Scenario Outline: Validate response with different data for get stores
    Given the api is available
    When endpoint "/stores/" is invoked with <id>
    Then the response should come with a status code of 200
     
    Examples: 
    |id|
    |4|
    |6|

  