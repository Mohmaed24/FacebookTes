Feature: Validate the login funtionality of facebook webstie
Background: 
Given User should open the chorme browser and launch the url 

@Regression			
Scenario: Validate with invalid username and password
When User should enter the invalid credentials in the feilds with List
#1 D Map
	|HI		 |BYE	|HI2		|BYE2	|
	|hi@123|bye@123|hi2@123|bye2@123|
	|hi@234|bye@234|hi2@234|bye2@234|
	|hi@345|bye@345|hi2@345|bye2@345|
	
And User should get the title of the page
And User to click login button
Then User login check invalid page opendUp

#Scenario Outline: Validate the lgoin passing valid username and invalid password
#When User passes username"<user>" and password"<pass>"
#And User to click login button
#Then User login check invalid page opendUp

#Examples:
					|user		|pass				|
					|Abcd		|123456			|
					|hi123	|abcd@13		|
					|Smart	|SmartSkill	|