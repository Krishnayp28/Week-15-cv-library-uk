@sanity @regression
Feature: Job Search Test
  As a user I can navigate to various pages successfully

  Scenario Outline:User should navigate to Job Search Result Using Different DataSet
    Given I am on homepage
    When  I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on more search option link
    And I enter min salary "<salaryMin>"
    And I enter max salary "<salaryMax>"
    And I select salary type"<salaryType>"
    And I select job type "<jobType>"
    And I click on find job button
    Then I should be able to see result "<result>"
      Examples:
        | jobTitle         | location              | distance | salaryMin | salaryMax | salaryType | jobType   | result                                           |
        | Tester           | Harrow                | 5        | 30000  | 500000 | annum      | Permanent | Permanent Tester jobs in Harrow on the Hill      |
        | Presser          | London                | 25       | 15000  | 30000  | annum      | Permanent | Permanent Presser jobs in London                 |
        | Store Manager    | Northamptonshire      | 15       | 300    | 60     | week       | Permanent | Permanent Store Manager jobs in Northamptonshire |
        | It Administrator | Warwick, Warwickshire | 15       | 40000  | 80000  | annum      | Permanent | Permanent It Administrator jobs in Warwick       |
        | Network Manager  | Reading               | 7        | 45000  | 65000  | annum      | Permanent | Permanent Network Manager jobs in Reading        |
        | Test Analyst     | Peterborough          | 15       | 45000  | 55000  | annum      | Part Time | Permanent Test Analyst jobs in Peterborough      |
        | Test Manager     | Milton Keynes         | 10       | 350    | 700    | day        | Permanent | Contract Test Manager jobs in Milton Keynes      |
