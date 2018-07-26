Feature:

    Scenario: sign in
        Given I enter easy jet url "https://www.easyjet.com/EN/"
        When I click Sign in button
        Then I should see Sign In button
