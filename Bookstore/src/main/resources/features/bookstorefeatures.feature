Feature: Login functionality check

Scenario: User is trying to signin in BookStore using invalid username and password

Given User is on BookStore Login Page
When User enter invalid username and password 
Then 'Invalid Username or Password' Message should display

Scenario: User is trying to signin in BookStore without entering username and password

Given User is on BookStore Login Page
When User has not entered username or password
Then 'Don't Keep the Required Fields Empty' alert message should display

Scenario:  User is trying to signin in BookStore using valid username and password

Given  User is on BookStore Login Page
When User enter valid username and password
Then User should successfully login to his Capbook account
 
Scenario:  Admin is trying to Add a Book in BookStore with valid Book Information

Given  Admin is on BookStore Book Addition Page
When Admin enter valid Book Information
Then Admin should successfully add a book

Scenario:  Admin is trying to Add a Book in BookStore with Invalid Book Information

Given  Admin is on BookStore Book Addition Page
When Admin enter Invalid Book Information
Then Admin should successfully add a book

Scenario:  Admin is trying to Add a Book in BookStore with valid Category Information

Given  Admin is on BookStore Book Category Page
When Admin enter valid Category Information
Then Admin should successfully add a Category

Scenario:  Admin is trying to Add a Book in BookStore with Invalid Category Information

Given  Admin is on BookStore Category Addition Page
When Admin enter Invalid Category Information
Then Admin should successfully add a Category

Scenario:  Admin is trying to Add a Book in BookStore with valid Author Information

Given  Admin is on BookStore Author Addition Page
When Admin enter valid Author Information
Then Admin should successfully add a Author

Scenario:  Admin is trying to Add a Book in BookStore with Invalid Author Information

Given  Admin is on BookStore Author Addition Page
When Admin enter Invalid Author Information
Then Admin should successfully add a Author

Scenario: User is trying to Register in BookStore using valid username and password

Given User is on BookStore Registration Page
When User enter valid Information
Then User should successfully register on bookstore