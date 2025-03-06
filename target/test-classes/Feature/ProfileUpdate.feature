Feature: Naukri Home page functionalities
	Background: 
		Given Navigate to Naukri Application
		And 	Enter the Credential
		And 	Login as user
		
		Scenario: Edit carrer profile
		When I navigate to My profile
		And Click on carrer profile
		And I click on "preffered location", select/deslect a "location"
		And Click on save button
		Then Validate success message should display on carrer profile page