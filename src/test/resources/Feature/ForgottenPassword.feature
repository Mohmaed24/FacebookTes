Feature: Validate the forgotpassword functionality 
Background: 
Given User should open the chorme browser and goto facebook

Scenario: Validate by passing mobile number to reset the password
When User should click the forgotpassword button
And Navigate to the password reset page
And User should pass the moble number
And User should click the search button
Then Validate the page url to know if password has resetted
					 