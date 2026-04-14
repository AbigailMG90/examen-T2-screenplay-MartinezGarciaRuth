Feature: User Registration
  Scenario: Successful registration with valid data
    Given the user navigates to the register page
    When the user fills the form with first name "Ruth Abigail", last name "Martinez Garcia", email "i202312774@cibertec.edu.pe", phone "987654321" and password "Test@12345"
    And accepts the privacy policy
    And clicks on continue
    Then the user should see the message "Your Account Has Been Created!"