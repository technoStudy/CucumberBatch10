Feature: Citizenship Function
#  Scenario Outline runs the same with different data sets multiple times

  Background:
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenships page

  Scenario Outline: Create a citizenship
    And Click on add button
    And Enter "<CitizenshipName>" and "<CitizenshipShortName>"
    When Click on save button
    Then Success message should be displayed

    Examples: Data for creating citizenship
      | CitizenshipName | CitizenshipShortName |
      | Batch 10 1      | BT10 1               |
      | Batch 10 2      | BT10 2               |
      | Batch 10 3      | BT10 3               |
      | Batch 10 4      | BT10 4               |

    # Create delete citizenship scenario with scenario outline and delete the citizenships you have created

  Scenario Outline: Delete a Citizenship
    And Search for "<CitizenshipName>"
    And Click on delete button
    When Click on delete confirm
    Then Success message should be displayed
    Examples:
      | CitizenshipName |
      | Batch 10 1      |
      | Batch 10 2      |
      | Batch 10 3      |
      | Batch 10 4      |





















