Scenario: Employee Bonus Calculation System
Problem Statement
Design a system to calculate bonuses for different types of employees in an organization.
Requirements
1.Use abstraction to define a common employee structure.
2.Use encapsulation to protect employee salary data.
3.Use polymorphism to calculate bonuses for different employee types using a common reference.

Functional Details
-Create an abstract class Employee
-Private variable salary
-Abstract method calculateBonus()
-Create two subclasses:
-PermanentEmployee
-ContractEmployee
-Each subclass should calculate bonus differently
-Use runtime polymorphism in main()

Expected Output (Sample)
Permanent Employee Bonus: 20000.0
Contract Employee Bonus: 5000.0
