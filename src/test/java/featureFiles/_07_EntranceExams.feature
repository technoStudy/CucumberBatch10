Feature: Entrance Exams Function

  Scenario Outline: Create an Entrance Exam
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Entrance Exams page
    And Click on add button
    And Fill the Create Exam form
      | <Exam Name> |
    And Add a Description
      | <Description> |
    And Add a Note
      | <Note> |
    When Click on save button
    Then Success message should be displayed

    Examples:
      | Exam Name       | Description            | Note                      |
      | Batch 10 Exam 1 | Batch 10 is the best   | We are coming strong      |
      | Batch 10 Exam 2 | Batch 10 is fun        | We can do it              |
      | Batch 10 Exam 3 | Batch 10 don't give up | It is too late to give up |

#    ToDo: Write a scenario to delete the exams you have created