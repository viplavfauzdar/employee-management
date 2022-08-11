Feature: Get All Employees

  Scenario: Get All Employees
    Given employee records exist
    When all employees are requested
    Then return all employees