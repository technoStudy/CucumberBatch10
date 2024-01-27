Feature: Country Function
  As a user I want to be able to create, update and delete
  different countries,
  so I can register students from different countries

  Scenario: Create a new Country
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Countries page
    And Click on add button
    And Enter country name and country code
    When Click on save button
    Then Success message should be displayed

    Scenario: Update a Country
      Given Navigate to Campus Web Site
      And Enter username and password
      And Click on Login Button
      And Navigate to Countries page
      And Search for the country
      And Click on edit button
      And Change the country code
      When Click on save button
      Then Success message should be displayed
