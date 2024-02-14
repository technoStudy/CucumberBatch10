Feature: Citizenship with Apache POI

  Background:
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenships page

  Scenario: Create Citizenship by getting data from Excel file
    Then Create a Citizenship by using Apache POI