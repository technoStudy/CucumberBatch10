Feature: Country Function
  As a user I want to be able to create, update and delete
  different countries,
  so I can register students from different countries

  Background: Runs before each scenario on this feature file
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Countries page

  Scenario: Create a new Country
#    Given Navigate to Campus Web Site
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Countries page
    And Click on add button
    And Enter country name and country code
    When Click on save button
    Then Success message should be displayed

  Scenario: Update a Country
#    Given Navigate to Campus Web Site
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Countries page
    And Search for the country
    And Click on edit button
    And Change the country code
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete a Country
#    Given Navigate to Campus Web Site
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Countries page
    And Search for the country
    And Click on delete button
    When Click on delete confirm
    Then Success message should be displayed

  Scenario: Create a new country with parameters
    And Click on add button
    And Enter "Batch 10" as country name and "BT10" as country code
    When Click on save button
    Then Success message should be displayed

#   ToDo: Create delete country scenario with parameters





















