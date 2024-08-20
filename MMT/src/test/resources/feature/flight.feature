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
Feature: Verifying the Flight booking functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Book a one-way flight for a given date
    Given I navigate to MakeMyTrip
    When I select from city "New Delhi"
    And I select to city "Pune"
    And I select the Month as "\'January\'" and date as "\'22\'" and year as "2025"
    And I Select one adult
    And I Select one children
    And I Select one infant
    And I Select "Premium Economy"
    And I click on apply
    And I Select the "Regular"
    And I click on search
    Then I Close the browser
