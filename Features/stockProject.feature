Feature:  All add client test



@addClient
Scenario Outline: to test the functionality of add button on add client form
Given I am on add customer page
When I Enter <name> , <address> , <contact1> , <contact2>
And I click on add button
Then customer should be added

Examples:
| name            | address                         | contact1   | contact2   |
| John Doe        | 123 Maple Street Springfield IL | 5551234567 | 1234567890 |
| Jane Smith      | 456 Oak Avenue Greenfield WI    | 5552345678 | 2345678901 |
| Michael Johnson | 789 Pine Road Riverdale CA      | 5553456789 | 3456789012 |
| Emily Davis     | 101 Cedar Street Lakeview TX    | 5554567890 | 4567890123 |
| William Brown   | 202 Birch Lane Brookside NY     | 5555678901 | 5678901234 |